package org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-OBSERVATION.body_weight.v2")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-08-25T08:32:22.252931+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0")
public class BodyWeightObservation implements EntryEntity {
  /**
   * Path: bloodpressure-demo.hip.v0/Body weight/Any event/Weight Description: The weight of the
   * individual.
   */
  @Path("/data[at0002]/events[at0003]/data[at0001]/items[at0004]/value|magnitude")
  private Double weightMagnitude;

  /**
   * Path: bloodpressure-demo.hip.v0/Body weight/Any event/Weight Description: The weight of the
   * individual.
   */
  @Path("/data[at0002]/events[at0003]/data[at0001]/items[at0004]/value|units")
  private String weightUnits;

  /** Path: bloodpressure-demo.hip.v0/Body weight/history/Any event/Simple/Weight/null_flavour */
  @Path("/data[at0002]/events[at0003]/data[at0001]/items[at0004]/null_flavour|defining_code")
  private NullFlavour weightNullFlavourDefiningCode;

  /**
   * Path: bloodpressure-demo.hip.v0/Body weight/Any event/Comment Description: Additional narrative
   * about the measurement of Body weight, not captured in other fields.
   */
  @Path("/data[at0002]/events[at0003]/data[at0001]/items[at0024]/value|value")
  private String commentValue;

  /** Path: bloodpressure-demo.hip.v0/Body weight/history/Any event/Simple/Comment/null_flavour */
  @Path("/data[at0002]/events[at0003]/data[at0001]/items[at0024]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: bloodpressure-demo.hip.v0/Body weight/Any event/State of dress Description: Description
   * of the state of dress of the person at the time of weighing.
   */
  @Path("/data[at0002]/events[at0003]/state[at0008]/items[at0009]/value|defining_code")
  private StateOfDressDefiningCode stateOfDressDefiningCode;

  /**
   * Path: bloodpressure-demo.hip.v0/Body weight/history/Any event/state structure/State of
   * dress/null_flavour
   */
  @Path("/data[at0002]/events[at0003]/state[at0008]/items[at0009]/null_flavour|defining_code")
  private NullFlavour stateOfDressNullFlavourDefiningCode;

  /**
   * Path: bloodpressure-demo.hip.v0/Body weight/Any event/Confounding factors Description: Record
   * any issues or factors that may impact on the measurement of body weight eg timing in menstrual
   * cycle, timing of recent bowel motion or noting of amputation.
   */
  @Path("/data[at0002]/events[at0003]/state[at0008]/items[at0025]")
  private List<BodyWeightConfoundingFactorsElement> confoundingFactors;

  /** Path: bloodpressure-demo.hip.v0/Body weight/Any event/time */
  @Path("/data[at0002]/events[at0003]/time|value")
  private TemporalAccessor timeValue;

  /** Path: bloodpressure-demo.hip.v0/Body weight/origin */
  @Path("/data[at0002]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: bloodpressure-demo.hip.v0/Body weight/Device Description: Details about the weighing
   * device.
   */
  @Path("/protocol[at0015]/items[at0020]")
  private Cluster device;

  /**
   * Path: bloodpressure-demo.hip.v0/Body weight/Extension Description: Additional information
   * required to capture local content or to align with other reference models/formalisms. Comment:
   * For example: local information requirements or additional metadata to align with FHIR or CIMI
   * equivalents.
   */
  @Path("/protocol[at0015]/items[at0027]")
  private List<Cluster> extension;

  /** Path: bloodpressure-demo.hip.v0/Body weight/subject */
  @Path("/subject")
  private PartyProxy subject;

  /** Path: bloodpressure-demo.hip.v0/Body weight/language */
  @Path("/language")
  private Language language;

  /** Path: bloodpressure-demo.hip.v0/Body weight/feeder_audit */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setWeightMagnitude(Double weightMagnitude) {
    this.weightMagnitude = weightMagnitude;
  }

  public Double getWeightMagnitude() {
    return this.weightMagnitude;
  }

  public void setWeightUnits(String weightUnits) {
    this.weightUnits = weightUnits;
  }

  public String getWeightUnits() {
    return this.weightUnits;
  }

  public void setWeightNullFlavourDefiningCode(NullFlavour weightNullFlavourDefiningCode) {
    this.weightNullFlavourDefiningCode = weightNullFlavourDefiningCode;
  }

  public NullFlavour getWeightNullFlavourDefiningCode() {
    return this.weightNullFlavourDefiningCode;
  }

  public void setCommentValue(String commentValue) {
    this.commentValue = commentValue;
  }

  public String getCommentValue() {
    return this.commentValue;
  }

  public void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode) {
    this.commentNullFlavourDefiningCode = commentNullFlavourDefiningCode;
  }

  public NullFlavour getCommentNullFlavourDefiningCode() {
    return this.commentNullFlavourDefiningCode;
  }

  public void setStateOfDressDefiningCode(StateOfDressDefiningCode stateOfDressDefiningCode) {
    this.stateOfDressDefiningCode = stateOfDressDefiningCode;
  }

  public StateOfDressDefiningCode getStateOfDressDefiningCode() {
    return this.stateOfDressDefiningCode;
  }

  public void setStateOfDressNullFlavourDefiningCode(
      NullFlavour stateOfDressNullFlavourDefiningCode) {
    this.stateOfDressNullFlavourDefiningCode = stateOfDressNullFlavourDefiningCode;
  }

  public NullFlavour getStateOfDressNullFlavourDefiningCode() {
    return this.stateOfDressNullFlavourDefiningCode;
  }

  public void setConfoundingFactors(List<BodyWeightConfoundingFactorsElement> confoundingFactors) {
    this.confoundingFactors = confoundingFactors;
  }

  public List<BodyWeightConfoundingFactorsElement> getConfoundingFactors() {
    return this.confoundingFactors;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
    this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
    return this.timeValue;
  }

  public void setOriginValue(TemporalAccessor originValue) {
    this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
    return this.originValue;
  }

  public void setDevice(Cluster device) {
    this.device = device;
  }

  public Cluster getDevice() {
    return this.device;
  }

  public void setExtension(List<Cluster> extension) {
    this.extension = extension;
  }

  public List<Cluster> getExtension() {
    return this.extension;
  }

  public void setSubject(PartyProxy subject) {
    this.subject = subject;
  }

  public PartyProxy getSubject() {
    return this.subject;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  public Language getLanguage() {
    return this.language;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
    this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
    return this.feederAudit;
  }
}
