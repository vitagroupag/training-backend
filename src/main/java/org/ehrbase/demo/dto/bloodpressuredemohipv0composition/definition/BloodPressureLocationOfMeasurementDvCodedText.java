package org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

import javax.annotation.processing.Generated;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-08-25T08:32:22.237937100+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0")
@OptionFor("DV_CODED_TEXT")
public class BloodPressureLocationOfMeasurementDvCodedText
    implements RMEntity, BloodPressureLocationOfMeasurementChoice {
  /**
   * Path: bloodpressure-demo.hip.v0/Blood pressure/Location of measurement/Location of measurement
   * Description: Simple body site where blood pressure was measured.
   */
  @Path("|defining_code")
  private LocationOfMeasurementDefiningCode locationOfMeasurementDefiningCode;

  public void setLocationOfMeasurementDefiningCode(
      LocationOfMeasurementDefiningCode locationOfMeasurementDefiningCode) {
    this.locationOfMeasurementDefiningCode = locationOfMeasurementDefiningCode;
  }

  public LocationOfMeasurementDefiningCode getLocationOfMeasurementDefiningCode() {
    return this.locationOfMeasurementDefiningCode;
  }
}
