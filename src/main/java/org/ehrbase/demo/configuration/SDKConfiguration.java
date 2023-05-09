package org.ehrbase.demo.configuration;

import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;
import org.ehrbase.client.openehrclient.OpenEhrClient;
import org.ehrbase.client.openehrclient.OpenEhrClientConfig;
import org.ehrbase.client.openehrclient.defaultrestclient.DefaultRestClient;
import org.ehrbase.serialisation.walker.defaultvalues.DefaultValuePath;
import org.ehrbase.serialisation.walker.defaultvalues.DefaultValues;
import org.ehrbase.webtemplate.model.WebTemplate;
import org.ehrbase.webtemplate.templateprovider.FileBasedTemplateProvider;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Configuration
public class SDKConfiguration {

  private static final String OPEN_EHR_URL = "https://8080-vitagroupag-ehrbasework-t1fh372phfw.ws-eu96b.gitpod.io/ehrbase/";

  @Bean
  public TemplateProvider getTemplateProvider() {

    FileBasedTemplateProvider fileBasedTemplateProvider =
        new FileBasedTemplateProvider(Path.of("./template")) {

          private final Map<String, Optional<WebTemplate>> map = new HashMap<>();

          @Override
          public Optional<WebTemplate> buildIntrospect(String templateId) {
            return map.computeIfAbsent(templateId, super::buildIntrospect);
          }
        };

    fileBasedTemplateProvider.buildIntrospect("bloodpressure-demo.hip.v0");
    return fileBasedTemplateProvider;
  }

  @Bean
  public OpenEhrClient getOpenEhrClient(TemplateProvider provider) throws URISyntaxException {
    OpenEhrClientConfig config = new OpenEhrClientConfig(new URI(OPEN_EHR_URL));
    config.setDefaultValuesProvider(
        t -> {
          DefaultValues defaultValues = new DefaultValues();
          defaultValues.addDefaultValue(DefaultValuePath.LANGUAGE, Language.EN);
          defaultValues.addDefaultValue(DefaultValuePath.TERRITORY, Territory.DE);
          return defaultValues;
        });
    DefaultRestClient client = new DefaultRestClient(config, provider);
    List.of("bloodpressure-demo.hip.v0").stream()
        .forEach(t -> client.templateEndpoint().ensureExistence(t));
    return client;
  }
}
