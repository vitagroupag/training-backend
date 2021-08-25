package org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PositionDefiningCode implements EnumValueSet {
  LYING_WITH_TILT_TO_LEFT(
      "Lying with tilt to left",
      "Flach liegend mit seitlicher Neigung, normalerweise zur linken Seite. Häufig verwendet im letzten Drittel eine Schwangerschaft, um aorto-cavale Kompression zu vermeiden.",
      "local",
      "at1014"),

  LYING("Lying", "Flach liegend zum Zeitpunkt der Blutdruckmessung.", "local", "at1003"),

  RECLINING(
      "Reclining", "Patient zurückgelehnt zum Zeitpunkt der Blutdruckmessung.", "local", "at1002"),

  SITTING(
      "Sitting",
      "Sitzend zum Zeitpunkt der Blutdruckmessung (z.B. auf einem Bett oder Stuhl).",
      "local",
      "at1001"),

  STANDING("Standing", "Stehend zum Zeitpunkt der Blutdruckmessung.", "local", "at1000");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  PositionDefiningCode(String value, String description, String terminologyId, String code) {
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
