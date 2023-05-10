package org.ehrbase.demo.controller;

import com.nedap.archie.rm.composition.Composition;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartySelf;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.time.StopWatch;
import org.ehrbase.client.aql.condition.Condition;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.EhrFields;
import org.ehrbase.client.aql.orderby.OrderByExpression;
import org.ehrbase.client.aql.query.EntityQuery;
import org.ehrbase.client.aql.query.Query;
import org.ehrbase.client.aql.record.Record;
import org.ehrbase.client.aql.record.Record3;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.flattener.Flattener;
import org.ehrbase.client.openehrclient.OpenEhrClient;
import org.ehrbase.demo.dto.bloodpressuredemohipv0composition.CompositionContainment;
import org.ehrbase.demo.dto.vitalsignscomposition.VitalSignsComposition;
import org.ehrbase.demo.dto.vitalsignscomposition.definition.BloodPressureObservation;
import org.ehrbase.demo.dto.vitalsignscomposition.definition.BloodPressureObservationContainment;
import org.ehrbase.serialisation.flatencoding.FlatFormat;
import org.ehrbase.serialisation.flatencoding.FlatJasonProvider;
import org.ehrbase.serialisation.flatencoding.FlatJson;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.temporal.TemporalAccessor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping(
    path = "/rest/ecis/v1/composition",
    produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
@RequiredArgsConstructor
public class Controller {

  private final TemplateProvider fileBasedTemplateProvider;
  private final OpenEhrClient client;
  private final StopWatch stopWatch = new StopWatch();

  @PostMapping()
  public ResponseEntity<Void> createComposition(
      @RequestParam(value = "templateId", required = false) String templateId,
      @RequestParam(value = "link", required = false) UUID linkId,
      @RequestParam(value = "ehrId") UUID ehrId,
      @RequestBody String content) {

      VitalSignsComposition dto = convert(templateId, content, VitalSignsComposition.class);

      System.out.println("test");
    dto.setComposer(new PartyIdentified(null, "MD. Dorian", null));
    dto.setSettingDefiningCode(Setting.PRIMARY_MEDICAL_CARE);
    dto.getBodyTemperature().setSubject(new PartySelf());    
    dto.getBloodPressure().setSubject(new PartySelf()); 
    
    dto.setReportIdValue("123456");

    client.compositionEndpoint(ehrId).mergeCompositionEntity(dto);
  
    return ResponseEntity.ok().build();
  }

  @GetMapping("/list/{ehr_id}")
  public ResponseEntity<List<Map<String, Object>>> list(
      @PathVariable(value = "ehr_id") UUID ehrId) {

         
     // Find all Documents
    CompositionContainment compositionContainment = CompositionContainment.getInstance();

    // Containing aOBSERVATION[openEHR-EHR-OBSERVATION.blood_pressure.v2]
    BloodPressureObservationContainment ObservationContainment =
        BloodPressureObservationContainment.getInstance();
    compositionContainment.setContains(ObservationContainment);

    EntityQuery<Record3<String, String, BloodPressureObservation>> query =
        Query.buildEntityQuery(
            compositionContainment,
            compositionContainment.TEMPLATE_ID,
            compositionContainment.UID,
            ObservationContainment.BLOOD_PRESSURE_OBSERVATION);

    query.where(Condition.equal(EhrFields.EHR_ID(), ehrId));

    List<Record3<String, String, BloodPressureObservation>> result =
        client.aqlEndpoint().execute(query);

    return ResponseEntity.ok(result.stream().map(this::toMap).collect(Collectors.toList()));
  }

  private Map<String, Object> toMap(Record record) {
    Map<String, Object> map = new HashMap<>();

    for (int i = 0; i < record.fields().length; ++i) {
      map.put(((AqlFieldImp) record.field(i)).getName(), record.value(i));
    }

    return map;
  }

  private VitalSignsComposition convert(
      String templateId, String content, Class<VitalSignsComposition> clazz) {
    FlatJson flatJson =
        new FlatJasonProvider(fileBasedTemplateProvider)
            .buildFlatJson(FlatFormat.SIM_SDT, templateId);

    Composition composition = flatJson.unmarshal(content, Composition.class);

    VitalSignsComposition flatten =
        new Flattener(fileBasedTemplateProvider).flatten(composition, clazz);
    return flatten;
  }
}
