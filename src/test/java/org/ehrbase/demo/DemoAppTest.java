package org.ehrbase.demo;

import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartySelf;

import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;
import org.ehrbase.client.openehrclient.OpenEhrClientConfig;
import org.ehrbase.client.openehrclient.VersionUid;
import org.ehrbase.client.openehrclient.defaultrestclient.DefaultRestClient;
import org.ehrbase.demo.dto.bloodpressuredemohipv0composition.BloodpressureDemoHipV0Composition;
import org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition.BloodPressureAnyEventPointEvent;
import org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition.BloodPressureObservation;
import org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition.CuffSizeDefiningCode;
import org.ehrbase.serialisation.walker.defaultvalues.DefaultValuePath;
import org.ehrbase.serialisation.walker.defaultvalues.DefaultValues;
import org.ehrbase.webtemplate.templateprovider.FileBasedTemplateProvider;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.UUID;

public class DemoAppTest {

  private static final String OPEN_EHR_URL = "https://8080-vitagroupag-ehrbasework-bprk1vlygjo.ws-eu96b.gitpod.io/ehrbase/";

  @Test
  public void Test() throws URISyntaxException {

    FileBasedTemplateProvider fileBasedTemplateProvider =
        new FileBasedTemplateProvider(Path.of("./template"));

    OpenEhrClientConfig config = new OpenEhrClientConfig(new URI(OPEN_EHR_URL));
    config.setDefaultValuesProvider(
        t -> {
          DefaultValues defaultValues = new DefaultValues();
          defaultValues.addDefaultValue(DefaultValuePath.LANGUAGE, Language.EN);
          defaultValues.addDefaultValue(DefaultValuePath.TERRITORY, Territory.DE);
          defaultValues.addDefaultValue(DefaultValuePath.TIME, OffsetDateTime.now());
          return defaultValues;
        });
    DefaultRestClient client = new DefaultRestClient(config, fileBasedTemplateProvider);

    client.templateEndpoint().ensureExistence("bloodpressure-demo.hip.v0");

    BloodpressureDemoHipV0Composition dto = new BloodpressureDemoHipV0Composition();

    dto.setComposer(new PartyIdentified(null, "MD. House", null));
    dto.setSettingDefiningCode(Setting.PRIMARY_MEDICAL_CARE);

    dto.setBloodPressure(new BloodPressureObservation());
    dto.getBloodPressure().setCuffSizeDefiningCode(CuffSizeDefiningCode.PAEDIATRIC_CHILD);
    dto.getBloodPressure().setSubject(new PartySelf());     

    BloodPressureAnyEventPointEvent measurement = new BloodPressureAnyEventPointEvent();

    measurement.setSystolicMagnitude(22d);
    measurement.setSystolicUnits("mm[Hg]");
    

    dto.getBloodPressure().setAnyEvent(Collections.singletonList(measurement));

    VersionUid versionUid =
        client
            .compositionEndpoint(UUID.fromString("2b2f6ca4-888a-423a-b94d-0a0dbed32641"))
            .mergeCompositionEntity(dto)
            .getVersionUid();
    System.out.println(versionUid);
  }
}
