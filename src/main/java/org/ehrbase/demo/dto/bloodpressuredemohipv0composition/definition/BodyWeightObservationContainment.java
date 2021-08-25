package org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import java.time.temporal.TemporalAccessor;

public class BodyWeightObservationContainment extends Containment {
  public SelectAqlField<BodyWeightObservation> BODY_WEIGHT_OBSERVATION =
      new AqlFieldImp<BodyWeightObservation>(
          BodyWeightObservation.class,
          "",
          "BodyWeightObservation",
          BodyWeightObservation.class,
          this);

  public SelectAqlField<Double> WEIGHT_MAGNITUDE =
      new AqlFieldImp<Double>(
          BodyWeightObservation.class,
          "/data[at0002]/events[at0003]/data[at0001]/items[at0004]/value|magnitude",
          "weightMagnitude",
          Double.class,
          this);

  public SelectAqlField<String> WEIGHT_UNITS =
      new AqlFieldImp<String>(
          BodyWeightObservation.class,
          "/data[at0002]/events[at0003]/data[at0001]/items[at0004]/value|units",
          "weightUnits",
          String.class,
          this);

  public SelectAqlField<NullFlavour> WEIGHT_NULL_FLAVOUR_DEFINING_CODE =
      new AqlFieldImp<NullFlavour>(
          BodyWeightObservation.class,
          "/data[at0002]/events[at0003]/data[at0001]/items[at0004]/null_flavour|defining_code",
          "weightNullFlavourDefiningCode",
          NullFlavour.class,
          this);

  public SelectAqlField<String> COMMENT_VALUE =
      new AqlFieldImp<String>(
          BodyWeightObservation.class,
          "/data[at0002]/events[at0003]/data[at0001]/items[at0024]/value|value",
          "commentValue",
          String.class,
          this);

  public SelectAqlField<NullFlavour> COMMENT_NULL_FLAVOUR_DEFINING_CODE =
      new AqlFieldImp<NullFlavour>(
          BodyWeightObservation.class,
          "/data[at0002]/events[at0003]/data[at0001]/items[at0024]/null_flavour|defining_code",
          "commentNullFlavourDefiningCode",
          NullFlavour.class,
          this);

  public SelectAqlField<StateOfDressDefiningCode> STATE_OF_DRESS_DEFINING_CODE =
      new AqlFieldImp<StateOfDressDefiningCode>(
          BodyWeightObservation.class,
          "/data[at0002]/events[at0003]/state[at0008]/items[at0009]/value|defining_code",
          "stateOfDressDefiningCode",
          StateOfDressDefiningCode.class,
          this);

  public SelectAqlField<NullFlavour> STATE_OF_DRESS_NULL_FLAVOUR_DEFINING_CODE =
      new AqlFieldImp<NullFlavour>(
          BodyWeightObservation.class,
          "/data[at0002]/events[at0003]/state[at0008]/items[at0009]/null_flavour|defining_code",
          "stateOfDressNullFlavourDefiningCode",
          NullFlavour.class,
          this);

  public ListSelectAqlField<BodyWeightConfoundingFactorsElement> CONFOUNDING_FACTORS =
      new ListAqlFieldImp<BodyWeightConfoundingFactorsElement>(
          BodyWeightObservation.class,
          "/data[at0002]/events[at0003]/state[at0008]/items[at0025]",
          "confoundingFactors",
          BodyWeightConfoundingFactorsElement.class,
          this);

  public SelectAqlField<TemporalAccessor> TIME_VALUE =
      new AqlFieldImp<TemporalAccessor>(
          BodyWeightObservation.class,
          "/data[at0002]/events[at0003]/time|value",
          "timeValue",
          TemporalAccessor.class,
          this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE =
      new AqlFieldImp<TemporalAccessor>(
          BodyWeightObservation.class,
          "/data[at0002]/origin|value",
          "originValue",
          TemporalAccessor.class,
          this);

  public SelectAqlField<Cluster> DEVICE =
      new AqlFieldImp<Cluster>(
          BodyWeightObservation.class,
          "/protocol[at0015]/items[at0020]",
          "device",
          Cluster.class,
          this);

  public ListSelectAqlField<Cluster> EXTENSION =
      new ListAqlFieldImp<Cluster>(
          BodyWeightObservation.class,
          "/protocol[at0015]/items[at0027]",
          "extension",
          Cluster.class,
          this);

  public SelectAqlField<PartyProxy> SUBJECT =
      new AqlFieldImp<PartyProxy>(
          BodyWeightObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE =
      new AqlFieldImp<Language>(
          BodyWeightObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT =
      new AqlFieldImp<FeederAudit>(
          BodyWeightObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private BodyWeightObservationContainment() {
    super("openEHR-EHR-OBSERVATION.body_weight.v2");
  }

  public static BodyWeightObservationContainment getInstance() {
    return new BodyWeightObservationContainment();
  }
}
