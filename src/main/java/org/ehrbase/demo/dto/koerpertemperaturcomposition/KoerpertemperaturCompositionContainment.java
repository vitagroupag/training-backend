package org.ehrbase.demo.dto.koerpertemperaturcomposition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;
import org.ehrbase.demo.dto.koerpertemperaturcomposition.definition.GeccoKoerpertemperaturKategorieElement;
import org.ehrbase.demo.dto.koerpertemperaturcomposition.definition.KoerpertemperaturObservation;
import org.ehrbase.demo.dto.koerpertemperaturcomposition.definition.StatusDefiningCode;

public class KoerpertemperaturCompositionContainment extends Containment {
  public SelectAqlField<KoerpertemperaturComposition> KOERPERTEMPERATUR_COMPOSITION = new AqlFieldImp<KoerpertemperaturComposition>(KoerpertemperaturComposition.class, "", "KoerpertemperaturComposition", KoerpertemperaturComposition.class, this);

  public SelectAqlField<Category> CATEGORY_DEFINING_CODE = new AqlFieldImp<Category>(KoerpertemperaturComposition.class, "/category|defining_code", "categoryDefiningCode", Category.class, this);

  public ListSelectAqlField<Cluster> ERWEITERUNG = new ListAqlFieldImp<Cluster>(KoerpertemperaturComposition.class, "/context/other_context[at0001]/items[at0002]", "erweiterung", Cluster.class, this);

  public SelectAqlField<StatusDefiningCode> STATUS_DEFINING_CODE = new AqlFieldImp<StatusDefiningCode>(KoerpertemperaturComposition.class, "/context/other_context[at0001]/items[at0004]/value|defining_code", "statusDefiningCode", StatusDefiningCode.class, this);

  public SelectAqlField<NullFlavour> STATUS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(KoerpertemperaturComposition.class, "/context/other_context[at0001]/items[at0004]/null_flavour|defining_code", "statusNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<GeccoKoerpertemperaturKategorieElement> KATEGORIE = new ListAqlFieldImp<GeccoKoerpertemperaturKategorieElement>(KoerpertemperaturComposition.class, "/context/other_context[at0001]/items[at0005]", "kategorie", GeccoKoerpertemperaturKategorieElement.class, this);

  public SelectAqlField<TemporalAccessor> START_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(KoerpertemperaturComposition.class, "/context/start_time|value", "startTimeValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Participation> PARTICIPATIONS = new ListAqlFieldImp<Participation>(KoerpertemperaturComposition.class, "/context/participations", "participations", Participation.class, this);

  public SelectAqlField<TemporalAccessor> END_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(KoerpertemperaturComposition.class, "/context/end_time|value", "endTimeValue", TemporalAccessor.class, this);

  public SelectAqlField<String> LOCATION = new AqlFieldImp<String>(KoerpertemperaturComposition.class, "/context/location", "location", String.class, this);

  public SelectAqlField<PartyIdentified> HEALTH_CARE_FACILITY = new AqlFieldImp<PartyIdentified>(KoerpertemperaturComposition.class, "/context/health_care_facility", "healthCareFacility", PartyIdentified.class, this);

  public SelectAqlField<Setting> SETTING_DEFINING_CODE = new AqlFieldImp<Setting>(KoerpertemperaturComposition.class, "/context/setting|defining_code", "settingDefiningCode", Setting.class, this);

  public SelectAqlField<KoerpertemperaturObservation> KOERPERTEMPERATUR = new AqlFieldImp<KoerpertemperaturObservation>(KoerpertemperaturComposition.class, "/content[openEHR-EHR-OBSERVATION.body_temperature.v2]", "koerpertemperatur", KoerpertemperaturObservation.class, this);

  public SelectAqlField<PartyProxy> COMPOSER = new AqlFieldImp<PartyProxy>(KoerpertemperaturComposition.class, "/composer", "composer", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(KoerpertemperaturComposition.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(KoerpertemperaturComposition.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<Territory> TERRITORY = new AqlFieldImp<Territory>(KoerpertemperaturComposition.class, "/territory", "territory", Territory.class, this);

  private KoerpertemperaturCompositionContainment() {
    super("openEHR-EHR-COMPOSITION.registereintrag.v1");
  }

  public static KoerpertemperaturCompositionContainment getInstance() {
    return new KoerpertemperaturCompositionContainment();
  }
}
