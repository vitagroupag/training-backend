package org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum DiastolicEndpointDefiningCode implements EnumValueSet {
  PHASE_V(
      "Phase V",
      "Das 5. Korotkoff-Geräusch - die Geräusche verschwinden völlig während der Manschettendruck unter den diastolischen Blutdruck fällt.",
      "local",
      "at1012"),

  PHASE_IV(
      "Phase IV",
      "Das 4. Korotkoff-Geräusch - Die Geräusche klingen plätzlich gedämpft.",
      "local",
      "at1011");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  DiastolicEndpointDefiningCode(
      String value, String description, String terminologyId, String code) {
    this.value = value;
    this.description = description;
    this.terminologyId = terminologyId;
    this.code = code;
  }

  public String getValue() {
    return this.value;
  }

  public String getDescription() {
    return this.description;
  }

  public String getTerminologyId() {
    return this.terminologyId;
  }

  public String getCode() {
    return this.code;
  }
}
