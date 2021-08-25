package org.ehrbase.demo.controller;

import com.nedap.archie.rm.composition.Composition;
import com.nedap.archie.rm.generic.PartyIdentified;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.time.StopWatch;
import org.ehrbase.client.aql.condition.Condition;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.EhrFields;
import org.ehrbase.client.aql.field.NativeSelectAqlField;
import org.ehrbase.client.aql.query.EntityQuery;
import org.ehrbase.client.aql.query.Query;
import org.ehrbase.client.aql.record.Record;
import org.ehrbase.client.aql.record.Record4;
import org.ehrbase.client.flattener.Flattener;
import org.ehrbase.client.openehrclient.OpenEhrClient;
import org.ehrbase.demo.dto.bloodpressuredemohipv0composition.BloodpressureDemoHipV0Composition;
import org.ehrbase.demo.dto.bloodpressuredemohipv0composition.BloodpressureDemoHipV0CompositionContainment;
import org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition.BloodPressureObservationContainment;
import org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition.CuffSizeDefiningCode;
import org.ehrbase.serialisation.flatencoding.FlatFormat;
import org.ehrbase.serialisation.flatencoding.FlatJasonProvider;
import org.ehrbase.serialisation.flatencoding.FlatJson;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
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

    BloodpressureDemoHipV0Composition dto =
        convert(templateId, content, BloodpressureDemoHipV0Composition.class);

    dto.setComposer(new PartyIdentified(null, "MD. House", null));

    client.compositionEndpoint(ehrId).mergeCompositionEntity(dto);

    return ResponseEntity.ok().build();
  }

  @GetMapping("/list/{ehr_id}")
  public ResponseEntity<List<Map<String, Object>>> list(
      @PathVariable(value = "ehr_id") UUID ehrId) {

    BloodpressureDemoHipV0CompositionContainment compositionContainment =
        BloodpressureDemoHipV0CompositionContainment.getInstance();
    BloodPressureObservationContainment ObservationContainment =
        BloodPressureObservationContainment.getInstance();
    compositionContainment.setContains(ObservationContainment);

    EntityQuery<Record4<String, String, CuffSizeDefiningCode, Double>> query =
        Query.buildEntityQuery(
            compositionContainment,
            new NativeSelectAqlField<>(
                compositionContainment, "/template_id", "template", String.class),
            new NativeSelectAqlField<>(compositionContainment, "/uid/value", "uid", String.class),
            ObservationContainment.CUFF_SIZE_DEFINING_CODE,
            new NativeSelectAqlField<>(
                ObservationContainment,
                "/data[at0001]/events[at0006]/data[at0003]/items[at0004]/value/magnitude",
                "systolicMagnitude",
                Double.class));

    query.where(Condition.equal(EhrFields.EHR_ID(), ehrId));
    List<Record4<String, String, CuffSizeDefiningCode, Double>> result =
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

  private BloodpressureDemoHipV0Composition convert(
      String templateId, String content, Class<BloodpressureDemoHipV0Composition> clazz) {
    FlatJson flatJson =
        new FlatJasonProvider(fileBasedTemplateProvider)
            .buildFlatJson(FlatFormat.SIM_SDT, templateId);

    stopWatch.reset();
    stopWatch.start();
    Composition composition = flatJson.unmarshal(content, Composition.class);
    stopWatch.stop();
    System.out.println("Time Elapsed Flat to Composition: " + stopWatch.getTime());
    composition.setUid(null);

    stopWatch.reset();
    stopWatch.start();
    BloodpressureDemoHipV0Composition flatten =
        new Flattener(fileBasedTemplateProvider).flatten(composition, clazz);
    stopWatch.stop();
    System.out.println("Time Elapsed Composition to dto: " + stopWatch.getTime());
    return flatten;
  }
}
