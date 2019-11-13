package com.example.service;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.example.model.RequestContext;

@Singleton
public class TestService {

    @Inject
    private RequestContext requestContext;

    public String getUri() {
        return requestContext.getUri();
    }
}
