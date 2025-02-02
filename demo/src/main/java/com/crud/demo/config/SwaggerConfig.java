package com.crud.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info().title("CRUD User API")
                        .description("User Service")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Hasan Kadir Demircan")
                                .email("demircanhasankadir@gmail.com")
                                .url("demircanhasankadir@gmail.com"))
                        .license(new License()
                                .name("Licence")
                                .url("Licence URI")));
    }
}
