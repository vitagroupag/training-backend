package org.ehrbase.demo.dto.bloodpressuredemohipv0composition;

import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.NativeSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class CompositionContainment extends Containment {

  public SelectAqlField<String> TEMPLATE_ID =
      new NativeSelectAqlField<>(this, "/template_id", "template", String.class);

  public SelectAqlField<String> UID =
      new NativeSelectAqlField<>(this, "/uid/value", "uid", String.class);

  private CompositionContainment() {
    super("COMPOSITION");
  }

  public static CompositionContainment getInstance() {
    return new CompositionContainment();
  }
}
