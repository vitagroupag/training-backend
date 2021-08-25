package org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-OBSERVATION.blood_pressure.v2")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-08-25T08:32:22.188890700+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0")
public class BloodPressureObservation implements EntryEntity {
  /**
   * Path: bloodpressure-demo.hip.v0/Blood pressure/Any event Description: Default, unspecified
   * point in time or interval event which may be explicitly defined in a template or at run-time.
   */
  @Path("/data[at0001]/events[at0006]")
  private List<BloodPressureAnyEventPointEvent> anyEvent;

  /** Path: bloodpressure-demo.hip.v0/Blood pressure/origin */
  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: bloodpressure-demo.hip.v0/Blood pressure/Cuff size Description: The size of the cuff used
   * for blood pressure measurement. Comment: Perloff D, Grim C, Flack J, Frohlich ED, Hill M,
   * McDonald M, Morgenstern BZ. Human blood pressure determination by sphygmomanometry. Circulation
   * 1993;88;2460-2470.
   */
  @Path("/protocol[at0011]/items[at0013]/value|defining_code")
  private CuffSizeDefiningCode cuffSizeDefiningCode;

  /** Path: bloodpressure-demo.hip.v0/Blood pressure/Tree/Cuff size/null_flavour */
  @Path("/protocol[at0011]/items[at0013]/null_flavour|defining_code")
  private NullFlavour cuffSizeNullFlavourDefiningCode;

  /** Path: bloodpressure-demo.hip.v0/Blood pressure/Tree/Location of measurement/null_flavour */
  @Path("/protocol[at0011]/items[at0014]/null_flavour|defining_code")
  private NullFlavour locationOfMeasurementNullFlavourDefiningCode;

  /**
   * Path: bloodpressure-demo.hip.v0/Blood pressure/Structured measurement location Description:
   * Structured anatomical location of where the measurement was taken.
   */
  @Path("/protocol[at0011]/items[at1057]")
  private List<Cluster> structuredMeasurementLocation;

  /**
   * Path: bloodpressure-demo.hip.v0/Blood pressure/Method Description: Method of measurement of
   * blood pressure.
   */
  @Path("/protocol[at0011]/items[at1035]/value|defining_code")
  private MethodDefiningCode methodDefiningCode;

  /** Path: bloodpressure-demo.hip.v0/Blood pressure/Tree/Method/null_flavour */
  @Path("/protocol[at0011]/items[at1035]/null_flavour|defining_code")
  private NullFlavour methodNullFlavourDefiningCode;

  /**
   * Path: bloodpressure-demo.hip.v0/Blood pressure/Mean arterial pressure formula Description:
   * Formula used to calculate the Mean Arterial Pressure (if recorded in data).
   */
  @Path("/protocol[at0011]/items[at1038]/value|value")
  private String meanArterialPressureFormulaValue;

  /**
   * Path: bloodpressure-demo.hip.v0/Blood pressure/Tree/Mean arterial pressure formula/null_flavour
   */
  @Path("/protocol[at0011]/items[at1038]/null_flavour|defining_code")
  private NullFlavour meanArterialPressureFormulaNullFlavourDefiningCode;

  /**
   * Path: bloodpressure-demo.hip.v0/Blood pressure/Systolic pressure formula Description: Formula
   * used to calculate the systolic pressure from from mean arterial pressure (if recorded in data).
   */
  @Path("/protocol[at0011]/items[at1054]/value|value")
  private String systolicPressureFormulaValue;

  /** Path: bloodpressure-demo.hip.v0/Blood pressure/Tree/Systolic pressure formula/null_flavour */
  @Path("/protocol[at0011]/items[at1054]/null_flavour|defining_code")
  private NullFlavour systolicPressureFormulaNullFlavourDefiningCode;

  /**
   * Path: bloodpressure-demo.hip.v0/Blood pressure/Diastolic pressure formula Description: Formula
   * used to calculate the diastolic pressure from mean arterial pressure (if recorded in data).
   */
  @Path("/protocol[at0011]/items[at1055]/value|value")
  private String diastolicPressureFormulaValue;

  /** Path: bloodpressure-demo.hip.v0/Blood pressure/Tree/Diastolic pressure formula/null_flavour */
  @Path("/protocol[at0011]/items[at1055]/null_flavour|defining_code")
  private NullFlavour diastolicPressureFormulaNullFlavourDefiningCode;

  /**
   * Path: bloodpressure-demo.hip.v0/Blood pressure/Diastolic endpoint Description: Record which
   * Korotkoff sound is used for determining diastolic pressure using auscultative method.
   */
  @Path("/protocol[at0011]/items[at1010]/value|defining_code")
  private DiastolicEndpointDefiningCode diastolicEndpointDefiningCode;

  /** Path: bloodpressure-demo.hip.v0/Blood pressure/Tree/Diastolic endpoint/null_flavour */
  @Path("/protocol[at0011]/items[at1010]/null_flavour|defining_code")
  private NullFlavour diastolicEndpointNullFlavourDefiningCode;

  /**
   * Path: bloodpressure-demo.hip.v0/Blood pressure/Device Description: Details about
   * sphygmomanometer or other device used to measure the blood pressure.
   */
  @Path("/protocol[at0011]/items[at1025]")
  private Cluster device;

  /**
   * Path: bloodpressure-demo.hip.v0/Blood pressure/Extension Description: Additional information
   * required to capture local context or to align with other reference models/formalisms. Comment:
   * For example: Local hospital departmental infomation or additional metadata to align with FHIR
   * or CIMI equivalents.
   */
  @Path("/protocol[at0011]/items[at1058]")
  private List<Cluster> extension;

  /** Path: bloodpressure-demo.hip.v0/Blood pressure/subject */
  @Path("/subject")
  private PartyProxy subject;

  /** Path: bloodpressure-demo.hip.v0/Blood pressure/language */
  @Path("/language")
  private Language language;

  /** Path: bloodpressure-demo.hip.v0/Blood pressure/feeder_audit */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: bloodpressure-demo.hip.v0/Blood pressure/Location of measurement Description: Simple body
   * site where blood pressure was measured.
   */
  @Path("/protocol[at0011]/items[at0014]/value")
  @Choice
  private BloodPressureLocationOfMeasurementChoice locationOfMeasurement;

  public void setAnyEvent(List<BloodPressureAnyEventPointEvent> anyEvent) {
    this.anyEvent = anyEvent;
  }

  public List<BloodPressureAnyEventPointEvent> getAnyEvent() {
    return this.anyEvent;
  }

  public void setOriginValue(TemporalAccessor originValue) {
    this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
    return this.originValue;
  }

  public void setCuffSizeDefiningCode(CuffSizeDefiningCode cuffSizeDefiningCode) {
    this.cuffSizeDefiningCode = cuffSizeDefiningCode;
  }

  public CuffSizeDefiningCode getCuffSizeDefiningCode() {
    return this.cuffSizeDefiningCode;
  }

  public void setCuffSizeNullFlavourDefiningCode(NullFlavour cuffSizeNullFlavourDefiningCode) {
    this.cuffSizeNullFlavourDefiningCode = cuffSizeNullFlavourDefiningCode;
  }

  public NullFlavour getCuffSizeNullFlavourDefiningCode() {
    return this.cuffSizeNullFlavourDefiningCode;
  }

  public void setLocationOfMeasurementNullFlavourDefiningCode(
      NullFlavour locationOfMeasurementNullFlavourDefiningCode) {
    this.locationOfMeasurementNullFlavourDefiningCode =
        locationOfMeasurementNullFlavourDefiningCode;
  }

  public NullFlavour getLocationOfMeasurementNullFlavourDefiningCode() {
    return this.locationOfMeasurementNullFlavourDefiningCode;
  }

  public void setStructuredMeasurementLocation(List<Cluster> structuredMeasurementLocation) {
    this.structuredMeasurementLocation = structuredMeasurementLocation;
  }

  public List<Cluster> getStructuredMeasurementLocation() {
    return this.structuredMeasurementLocation;
  }

  public void setMethodDefiningCode(MethodDefiningCode methodDefiningCode) {
    this.methodDefiningCode = methodDefiningCode;
  }

  public MethodDefiningCode getMethodDefiningCode() {
    return this.methodDefiningCode;
  }

  public void setMethodNullFlavourDefiningCode(NullFlavour methodNullFlavourDefiningCode) {
    this.methodNullFlavourDefiningCode = methodNullFlavourDefiningCode;
  }

  public NullFlavour getMethodNullFlavourDefiningCode() {
    return this.methodNullFlavourDefiningCode;
  }

  public void setMeanArterialPressureFormulaValue(String meanArterialPressureFormulaValue) {
    this.meanArterialPressureFormulaValue = meanArterialPressureFormulaValue;
  }

  public String getMeanArterialPressureFormulaValue() {
    return this.meanArterialPressureFormulaValue;
  }

  public void setMeanArterialPressureFormulaNullFlavourDefiningCode(
      NullFlavour meanArterialPressureFormulaNullFlavourDefiningCode) {
    this.meanArterialPressureFormulaNullFlavourDefiningCode =
        meanArterialPressureFormulaNullFlavourDefiningCode;
  }

  public NullFlavour getMeanArterialPressureFormulaNullFlavourDefiningCode() {
    return this.meanArterialPressureFormulaNullFlavourDefiningCode;
  }

  public void setSystolicPressureFormulaValue(String systolicPressureFormulaValue) {
    this.systolicPressureFormulaValue = systolicPressureFormulaValue;
  }

  public String getSystolicPressureFormulaValue() {
    return this.systolicPressureFormulaValue;
  }

  public void setSystolicPressureFormulaNullFlavourDefiningCode(
      NullFlavour systolicPressureFormulaNullFlavourDefiningCode) {
    this.systolicPressureFormulaNullFlavourDefiningCode =
        systolicPressureFormulaNullFlavourDefiningCode;
  }

  public NullFlavour getSystolicPressureFormulaNullFlavourDefiningCode() {
    return this.systolicPressureFormulaNullFlavourDefiningCode;
  }

  public void setDiastolicPressureFormulaValue(String diastolicPressureFormulaValue) {
    this.diastolicPressureFormulaValue = diastolicPressureFormulaValue;
  }

  public String getDiastolicPressureFormulaValue() {
    return this.diastolicPressureFormulaValue;
  }

  public void setDiastolicPressureFormulaNullFlavourDefiningCode(
      NullFlavour diastolicPressureFormulaNullFlavourDefiningCode) {
    this.diastolicPressureFormulaNullFlavourDefiningCode =
        diastolicPressureFormulaNullFlavourDefiningCode;
  }

  public NullFlavour getDiastolicPressureFormulaNullFlavourDefiningCode() {
    return this.diastolicPressureFormulaNullFlavourDefiningCode;
  }

  public void setDiastolicEndpointDefiningCode(
      DiastolicEndpointDefiningCode diastolicEndpointDefiningCode) {
    this.diastolicEndpointDefiningCode = diastolicEndpointDefiningCode;
  }

  public DiastolicEndpointDefiningCode getDiastolicEndpointDefiningCode() {
    return this.diastolicEndpointDefiningCode;
  }

  public void setDiastolicEndpointNullFlavourDefiningCode(
      NullFlavour diastolicEndpointNullFlavourDefiningCode) {
    this.diastolicEndpointNullFlavourDefiningCode = diastolicEndpointNullFlavourDefiningCode;
  }

  public NullFlavour getDiastolicEndpointNullFlavourDefiningCode() {
    return this.diastolicEndpointNullFlavourDefiningCode;
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

  public void setLocationOfMeasurement(
      BloodPressureLocationOfMeasurementChoice locationOfMeasurement) {
    this.locationOfMeasurement = locationOfMeasurement;
  }

  public BloodPressureLocationOfMeasurementChoice getLocationOfMeasurement() {
    return this.locationOfMeasurement;
  }
}
