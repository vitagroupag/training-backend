package org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum MethodDefiningCode implements EnumValueSet {
  AUSCULTATION(
      "Auscultation",
      "Auskulatorische Messung unter Benutzung eines Stethoskops und der Korotkoff-Geräusche.",
      "local",
      "at1036"),

  MACHINE("Machine", "Messung durch eine Blutdruckmaschine.", "local", "at1039"),

  PALPATION(
      "Palpation",
      "Palpatorische Messung, normalerweise an den brachialen oder radialen Arterien.",
      "local",
      "at1037"),

  INVASIVE(
      "Invasive", "Invasive Messung des Blutdrucks innerhalb eines Gefäßes.", "local", "at1040");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  MethodDefiningCode(String value, String description, String terminologyId, String code) {
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
