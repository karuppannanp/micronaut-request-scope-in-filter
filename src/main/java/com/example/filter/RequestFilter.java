package com.example.filter;

import javax.inject.Inject;

import io.micronaut.core.order.Ordered;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.Filter;
import io.micronaut.http.filter.OncePerRequestHttpServerFilter;
import io.micronaut.http.filter.ServerFilterChain;
import org.reactivestreams.Publisher;

import com.example.model.RequestContext;

@Filter("/**")
public class RequestFilter extends OncePerRequestHttpServerFilter {

    @Inject
    private RequestContext requestContext;

    @Override
    protected Publisher<MutableHttpResponse<?>> doFilterOnce(HttpRequest<?> request, ServerFilterChain chain) {
        requestContext.setUri(request.getPath());
        return chain.proceed(request);
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
