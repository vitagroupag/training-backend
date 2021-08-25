package org.ehrbase.demo.dto.bloodpressuredemohipv0composition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum SleepStatusDefiningCode implements EnumValueSet {
  SLEEPING("Sleeping", "Die untersuchte Person schläft.", "local", "at1045"),

  AWAKE("Awake", "Die untersuchte Person ist bei vollem Bewusstsein.", "local", "at1044");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  SleepStatusDefiningCode(String value, String description, String terminologyId, String code) {
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
