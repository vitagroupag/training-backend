package org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-08-25T08:32:22.259936600+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0")
public class BodyWeightConfoundingFactorsElement implements LocatableEntity {
  /**
   * Path: bloodpressure-demo.hip.v0/Body weight/Any event/Confounding factors Description: Record
   * any issues or factors that may impact on the measurement of body weight eg timing in menstrual
   * cycle, timing of recent bowel motion or noting of amputation.
   */
  @Path("/value|value")
  private String value;

  /**
   * Path: bloodpressure-demo.hip.v0/Body weight/history/Any event/state structure/Confounding
   * factors/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /** Path: bloodpressure-demo.hip.v0/Body weight/Any event/feeder_audit */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setValue(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }

  public void setValue2(NullFlavour value2) {
    this.value2 = value2;
  }

  public NullFlavour getValue2() {
    return this.value2;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
    this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
    return this.feederAudit;
  }
}
