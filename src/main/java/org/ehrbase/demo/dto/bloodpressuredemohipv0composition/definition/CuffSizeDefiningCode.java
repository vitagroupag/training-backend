package org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum CuffSizeDefiningCode implements EnumValueSet {
  PAEDIATRIC_CHILD(
      "Paediatric/Child",
      "Eine Manschette für ein Kind oder auch einen Erwachsenen mit einem schmalen Arm - 8cm x 21cm.",
      "local",
      "at1009"),

  LARGE_ADULT(
      "Large Adult",
      "Eine Manschette für Erwachsene mit größeren Armen - ca. 16cm x 38cm.",
      "local",
      "at0016"),

  INFANT(
      "Infant",
      "Eine Manschette für Kleinkinder und Säuglinge - ca. 5cm x 15cm.",
      "local",
      "at1018"),

  SMALL_ADULT(
      "Small Adult",
      "Eine Manschette für einen kleinen Erwachsenen - ca. 10cm x 24cm.",
      "local",
      "at1008"),

  ADULT_THIGH(
      "Adult Thigh",
      "Eine Manschette für den Oberschenkel eines Erwachsenen - ca. 20cm x 42cm.",
      "local",
      "at0015"),

  ADULT(
      "Adult",
      "Eine Standard-Manschette für einen Erwachsenen - ca. 13cm x 30cm.",
      "local",
      "at0017"),

  NEONATAL(
      "Neonatal",
      "Eine Manschette für Neugeborene mit passender Größe für die Reife und das Geburtsgewicht des Neugeborenen.",
      "local",
      "at1019");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  CuffSizeDefiningCode(String value, String description, String terminologyId, String code) {
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
