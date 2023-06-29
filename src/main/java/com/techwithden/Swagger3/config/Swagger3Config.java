package com.techwithden.Swagger3.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Swagger3Config {

    @Bean
    public OpenAPI myApiDocumentatrion(){
        return new OpenAPI()
                .info(new Info()
                        .title("Tech With Den")
                        .description("Swagger 3 Tutorial")
                        .version("1"));
    }
}
