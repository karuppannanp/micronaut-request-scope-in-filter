package com.example;

import io.micronaut.runtime.Micronaut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FilterRequestApplication {
    private static final Logger LOG = LoggerFactory.getLogger(FilterRequestApplication.class);

    public static void main(String[] args) throws Exception {
        LOG.info("Starting Micronaut based Application");
        Micronaut.run(FilterRequestApplication.class);
    }
}