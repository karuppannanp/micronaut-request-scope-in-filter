package com.example.controller;

import javax.inject.Inject;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import com.example.service.TestService;

@Controller("/test")
public class TestController {

    @Inject
    private TestService testService;

    @Get(value = "/example/{parameter}", produces = MediaType.APPLICATION_JSON)
    public HttpResponse<String> getUri(
            @PathVariable(value = "parameter", defaultValue = "not-present") String parameter) {
        return HttpResponse.ok(testService.getUri());
    }
}
