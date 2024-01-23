package com.ipbd.framework.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger配置
 *
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi userApi() {
        String[] paths = {"/**"};
        String[] packagedToMatch = {"com.ipbd"};
        return GroupedOpenApi.builder().group("IpbdBoot")
                .pathsToMatch(paths)
                .packagesToScan(packagedToMatch).build();
    }

    @Bean
    public OpenAPI customOpenAPI() {
        Contact contact = new Contact();
        contact.setName("IPBD");

        return new OpenAPI().info(new Info()
                .title("IpbdBoot")
                .description("IpbdBoot")
                .contact(contact)
                .version("3.0")
                .termsOfService("https://com.ipbd")
                .license(new License().name("MIT")
                        .url("https://com.ipbd")));
    }

}