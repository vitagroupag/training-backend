package org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum LocationOfMeasurementDefiningCode implements EnumValueSet {
  LEFT_WRIST("Left wrist", "Das linke Handgelenk der Person.", "local", "at1021"),

  INTRA_ARTERIAL(
      "Intra-arterial",
      "Invasive Messung mittels Transducer über einen arteriellen Zugang.",
      "local",
      "at1053"),

  LEFT_ARM("Left arm", "Der linke Arm der Person.", "local", "at0026"),

  RIGHT_ANKLE("Right ankle", "Das rechte Fußgelenk der Person.", "local", "at1026"),

  TOE("Toe", "Ein Zeh des Individuums.", "local", "at1051"),

  RIGHT_WRIST("Right wrist", "Das rechte Handgelenk der Person.", "local", "at1020"),

  DORSUM_OF_FOOT("Dorsum of foot", "Fußrücken des Individuums.", "local", "at1056"),

  RIGHT_THIGH("Right thigh", "Der rechte Oberschenkel der Person.", "local", "at0027"),

  LEFT_THIGH("Left thigh", "Der linke Oberschenkel der Person.", "local", "at0028"),

  RIGHT_ARM("Right arm", "Der rechte Arm der Person.", "local", "at0025"),

  LEFT_ANKLE("Left ankle", "Das linke Fußgelenk der Person", "local", "at1031"),

  FINGER("Finger", "Ein Finger des Individuums.", "local", "at1032");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  LocationOfMeasurementDefiningCode(
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
