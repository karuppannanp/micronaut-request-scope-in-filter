package com.example.controller;

import javax.inject.Inject;

import io.micronaut.context.annotation.Parameter;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Produces;

import com.example.service.TestService;

@Controller("/test")
public class TestController {

    @Inject
    private TestService testService;

    @Get("/example/{uri}")
    @Produces(MediaType.APPLICATION_JSON)
    public HttpResponse<String> getUri(@PathVariable(value = "uri") String uri) {
        return HttpResponse.ok(testService.getUri());
    }
}
