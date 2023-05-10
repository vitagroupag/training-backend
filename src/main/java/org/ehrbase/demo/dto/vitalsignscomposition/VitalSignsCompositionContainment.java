package org.ehrbase.demo.dto.vitalsignscomposition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;
import org.ehrbase.demo.dto.vitalsignscomposition.definition.BloodPressureObservation;
import org.ehrbase.demo.dto.vitalsignscomposition.definition.BodyTemperatureObservation;

public class VitalSignsCompositionContainment extends Containment {
  public SelectAqlField<VitalSignsComposition> VITAL_SIGNS_COMPOSITION = new AqlFieldImp<VitalSignsComposition>(VitalSignsComposition.class, "", "VitalSignsComposition", VitalSignsComposition.class, this);

  public SelectAqlField<Category> CATEGORY_DEFINING_CODE = new AqlFieldImp<Category>(VitalSignsComposition.class, "/category|defining_code", "categoryDefiningCode", Category.class, this);

  public SelectAqlField<String> REPORT_ID_VALUE = new AqlFieldImp<String>(VitalSignsComposition.class, "/context/other_context[at0001]/items[at0002]/value|value", "reportIdValue", String.class, this);

  public SelectAqlField<NullFlavour> REPORT_ID_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(VitalSignsComposition.class, "/context/other_context[at0001]/items[at0002]/null_flavour|defining_code", "reportIdNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> STATUS_VALUE = new AqlFieldImp<String>(VitalSignsComposition.class, "/context/other_context[at0001]/items[at0005]/value|value", "statusValue", String.class, this);

  public SelectAqlField<NullFlavour> STATUS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(VitalSignsComposition.class, "/context/other_context[at0001]/items[at0005]/null_flavour|defining_code", "statusNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(VitalSignsComposition.class, "/context/other_context[at0001]/items[at0006]", "extension", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> START_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(VitalSignsComposition.class, "/context/start_time|value", "startTimeValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Participation> PARTICIPATIONS = new ListAqlFieldImp<Participation>(VitalSignsComposition.class, "/context/participations", "participations", Participation.class, this);

  public SelectAqlField<TemporalAccessor> END_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(VitalSignsComposition.class, "/context/end_time|value", "endTimeValue", TemporalAccessor.class, this);

  public SelectAqlField<String> LOCATION = new AqlFieldImp<String>(VitalSignsComposition.class, "/context/location", "location", String.class, this);

  public SelectAqlField<PartyIdentified> HEALTH_CARE_FACILITY = new AqlFieldImp<PartyIdentified>(VitalSignsComposition.class, "/context/health_care_facility", "healthCareFacility", PartyIdentified.class, this);

  public SelectAqlField<Setting> SETTING_DEFINING_CODE = new AqlFieldImp<Setting>(VitalSignsComposition.class, "/context/setting|defining_code", "settingDefiningCode", Setting.class, this);

  public SelectAqlField<BloodPressureObservation> BLOOD_PRESSURE = new AqlFieldImp<BloodPressureObservation>(VitalSignsComposition.class, "/content[openEHR-EHR-OBSERVATION.blood_pressure.v2]", "bloodPressure", BloodPressureObservation.class, this);

  public SelectAqlField<BodyTemperatureObservation> BODY_TEMPERATURE = new AqlFieldImp<BodyTemperatureObservation>(VitalSignsComposition.class, "/content[openEHR-EHR-OBSERVATION.body_temperature.v2]", "bodyTemperature", BodyTemperatureObservation.class, this);

  public SelectAqlField<PartyProxy> COMPOSER = new AqlFieldImp<PartyProxy>(VitalSignsComposition.class, "/composer", "composer", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(VitalSignsComposition.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(VitalSignsComposition.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<Territory> TERRITORY = new AqlFieldImp<Territory>(VitalSignsComposition.class, "/territory", "territory", Territory.class, this);

  private VitalSignsCompositionContainment() {
    super("openEHR-EHR-COMPOSITION.report.v1");
  }

  public static VitalSignsCompositionContainment getInstance() {
    return new VitalSignsCompositionContainment();
  }
}
