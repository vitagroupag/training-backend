package org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum StateOfDressDefiningCode implements EnumValueSet {
  NAPPY_DIAPER(
      "Nappy/diaper", "Trägt Windel; kann signifikant zum Gewicht beitragen.", "local", "at0017"),

  LIGHTLY_CLOTHED_UNDERWEAR(
      "Lightly clothed/underwear",
      "Bekleidung, die nicht signifikant zum Gewicht beiträgt.",
      "local",
      "at0011"),

  NAKED("Naked", "Ohne Kleidung.", "local", "at0013"),

  FULLY_CLOTHED_INCLUDING_SHOES(
      "Fully clothed, including shoes",
      "Bekleidung, die signifikant zum Gewicht beiträgt, mit Schuhen.",
      "local",
      "at0010"),

  FULLY_CLOTHED_WITHOUT_SHOES(
      "Fully clothed, without shoes",
      "Bekleidung, die signifikant zum Gewicht beiträgt.",
      "local",
      "at0028");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  StateOfDressDefiningCode(String value, String description, String terminologyId, String code) {
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
