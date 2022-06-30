package com.kotlsov.production.planner.config;

import com.kotlsov.production.planner.ApiUrl;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @Info(title = "Production Planner API", version = ApiUrl.API_VERSION)
)
public class OpenApiConfiguration {
}
