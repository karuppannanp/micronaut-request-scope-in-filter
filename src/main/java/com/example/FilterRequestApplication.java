package com.example;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@OpenAPIDefinition(
        info = @Info(
                title = "Test-Api",
                version = "0.1",
                description = "Test API",
                license = @License(name = "Example Inc")
        )
)


public class FilterRequestApplication {
    private static final Logger LOG = LoggerFactory.getLogger(FilterRequestApplication.class);

    public static void main(String[] args) throws Exception {
        LOG.info("Starting Micronaut based Application");
        Micronaut.run(FilterRequestApplication.class);
    }
}