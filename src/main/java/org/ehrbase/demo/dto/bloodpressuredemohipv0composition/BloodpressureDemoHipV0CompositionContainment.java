package org.ehrbase.demo.dto.bloodpressuredemohipv0composition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.*;
import org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition.BloodPressureObservation;
import org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition.BodyWeightObservation;

import java.time.temporal.TemporalAccessor;

public class BloodpressureDemoHipV0CompositionContainment extends Containment {
  public SelectAqlField<BloodpressureDemoHipV0Composition> BLOODPRESSURE_DEMO_HIP_V0_COMPOSITION =
      new AqlFieldImp<BloodpressureDemoHipV0Composition>(
          BloodpressureDemoHipV0Composition.class,
          "",
          "BloodpressureDemoHipV0Composition",
          BloodpressureDemoHipV0Composition.class,
          this);

  public SelectAqlField<Category> CATEGORY_DEFINING_CODE =
      new AqlFieldImp<Category>(
          BloodpressureDemoHipV0Composition.class,
          "/category|defining_code",
          "categoryDefiningCode",
          Category.class,
          this);

  public SelectAqlField<String> REPORT_ID_VALUE =
      new AqlFieldImp<String>(
          BloodpressureDemoHipV0Composition.class,
          "/context/other_context[at0001]/items[at0002]/value|value",
          "reportIdValue",
          String.class,
          this);

  public SelectAqlField<NullFlavour> REPORT_ID_NULL_FLAVOUR_DEFINING_CODE =
      new AqlFieldImp<NullFlavour>(
          BloodpressureDemoHipV0Composition.class,
          "/context/other_context[at0001]/items[at0002]/null_flavour|defining_code",
          "reportIdNullFlavourDefiningCode",
          NullFlavour.class,
          this);

  public SelectAqlField<String> STATUS_VALUE =
      new AqlFieldImp<String>(
          BloodpressureDemoHipV0Composition.class,
          "/context/other_context[at0001]/items[at0005]/value|value",
          "statusValue",
          String.class,
          this);

  public SelectAqlField<NullFlavour> STATUS_NULL_FLAVOUR_DEFINING_CODE =
      new AqlFieldImp<NullFlavour>(
          BloodpressureDemoHipV0Composition.class,
          "/context/other_context[at0001]/items[at0005]/null_flavour|defining_code",
          "statusNullFlavourDefiningCode",
          NullFlavour.class,
          this);

  public ListSelectAqlField<Cluster> EXTENSION =
      new ListAqlFieldImp<Cluster>(
          BloodpressureDemoHipV0Composition.class,
          "/context/other_context[at0001]/items[at0006]",
          "extension",
          Cluster.class,
          this);

  public SelectAqlField<TemporalAccessor> START_TIME_VALUE =
      new AqlFieldImp<TemporalAccessor>(
          BloodpressureDemoHipV0Composition.class,
          "/context/start_time|value",
          "startTimeValue",
          TemporalAccessor.class,
          this);

  public ListSelectAqlField<Participation> PARTICIPATIONS =
      new ListAqlFieldImp<Participation>(
          BloodpressureDemoHipV0Composition.class,
          "/context/participations",
          "participations",
          Participation.class,
          this);

  public SelectAqlField<TemporalAccessor> END_TIME_VALUE =
      new AqlFieldImp<TemporalAccessor>(
          BloodpressureDemoHipV0Composition.class,
          "/context/end_time|value",
          "endTimeValue",
          TemporalAccessor.class,
          this);

  public SelectAqlField<String> LOCATION =
      new AqlFieldImp<String>(
          BloodpressureDemoHipV0Composition.class,
          "/context/location",
          "location",
          String.class,
          this);

  public SelectAqlField<PartyIdentified> HEALTH_CARE_FACILITY =
      new AqlFieldImp<PartyIdentified>(
          BloodpressureDemoHipV0Composition.class,
          "/context/health_care_facility",
          "healthCareFacility",
          PartyIdentified.class,
          this);

  public SelectAqlField<Setting> SETTING_DEFINING_CODE =
      new AqlFieldImp<Setting>(
          BloodpressureDemoHipV0Composition.class,
          "/context/setting|defining_code",
          "settingDefiningCode",
          Setting.class,
          this);

  public SelectAqlField<BloodPressureObservation> BLOOD_PRESSURE =
      new AqlFieldImp<BloodPressureObservation>(
          BloodpressureDemoHipV0Composition.class,
          "/content[openEHR-EHR-OBSERVATION.blood_pressure.v2]",
          "bloodPressure",
          BloodPressureObservation.class,
          this);

  public SelectAqlField<BodyWeightObservation> BODY_WEIGHT =
      new AqlFieldImp<BodyWeightObservation>(
          BloodpressureDemoHipV0Composition.class,
          "/content[openEHR-EHR-OBSERVATION.body_weight.v2]",
          "bodyWeight",
          BodyWeightObservation.class,
          this);

  public SelectAqlField<PartyProxy> COMPOSER =
      new AqlFieldImp<PartyProxy>(
          BloodpressureDemoHipV0Composition.class, "/composer", "composer", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE =
      new AqlFieldImp<Language>(
          BloodpressureDemoHipV0Composition.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT =
      new AqlFieldImp<FeederAudit>(
          BloodpressureDemoHipV0Composition.class,
          "/feeder_audit",
          "feederAudit",
          FeederAudit.class,
          this);

  public SelectAqlField<Territory> TERRITORY =
      new AqlFieldImp<Territory>(
          BloodpressureDemoHipV0Composition.class,
          "/territory",
          "territory",
          Territory.class,
          this);

  private BloodpressureDemoHipV0CompositionContainment() {
    super("openEHR-EHR-COMPOSITION.report-procedure.v1");
  }

  public static BloodpressureDemoHipV0CompositionContainment getInstance() {
    return new BloodpressureDemoHipV0CompositionContainment();
  }
}
