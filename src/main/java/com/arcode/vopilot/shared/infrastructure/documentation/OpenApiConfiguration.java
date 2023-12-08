package com.arcode.vopilot.shared.infrastructure.documentation;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI vopilotOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Vopilot API")
                        .description("Arcode Vopilot application REST API documentation.")
                        .version("1.0.0")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Vopilot Wiki Documentation")
                        .url("https://github.com/arcodeorg/vopilot/wiki"));
    }
}
