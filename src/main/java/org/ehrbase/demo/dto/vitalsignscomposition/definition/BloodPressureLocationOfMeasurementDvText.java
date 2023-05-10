package org.ehrbase.demo.dto.vitalsignscomposition.definition;

import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-05-10T09:56:55.561321316Z",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.26.0"
)
@OptionFor("DV_TEXT")
public class BloodPressureLocationOfMeasurementDvText implements RMEntity, BloodPressureLocationOfMeasurementChoice {
  /**
   * Path: vital_signs/Blood pressure/Location of measurement/Location of measurement
   * Description: Simple body site where blood pressure was measured.
   */
  @Path("|value")
  private String locationOfMeasurementValue;

  public void setLocationOfMeasurementValue(String locationOfMeasurementValue) {
     this.locationOfMeasurementValue = locationOfMeasurementValue;
  }

  public String getLocationOfMeasurementValue() {
     return this.locationOfMeasurementValue ;
  }
}
