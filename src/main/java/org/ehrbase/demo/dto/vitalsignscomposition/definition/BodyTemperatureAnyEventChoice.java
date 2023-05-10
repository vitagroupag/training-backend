package org.ehrbase.demo.dto.vitalsignscomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-05-10T09:56:55.571217784Z",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.26.0"
)
public interface BodyTemperatureAnyEventChoice {
  Double getTemperatureMagnitude();

  void setTemperatureMagnitude(Double temperatureMagnitude);

  Cluster getExertion();

  void setExertion(Cluster exertion);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  String getTemperatureUnits();

  void setTemperatureUnits(String temperatureUnits);

  String getCommentValue();

  void setCommentValue(String commentValue);

  NullFlavour getTemperatureNullFlavourDefiningCode();

  void setTemperatureNullFlavourDefiningCode(NullFlavour temperatureNullFlavourDefiningCode);

  NullFlavour getCommentNullFlavourDefiningCode();

  void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode);

  List<Cluster> getEnvironmentalConditions();

  void setEnvironmentalConditions(List<Cluster> environmentalConditions);
}
