package com.pulgupta.demo.controller;

import com.pulgupta.demo.model.AuthRequest;
import com.pulgupta.demo.model.AuthRequestv2;
import com.pulgupta.demo.model.AuthResponse;
import com.pulgupta.demo.service.AuthService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import javax.inject.Inject;

@Controller(value = "/auth")
public class AuthController {

    @Inject
    AuthService service;

    @Post(produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public AuthResponse getAuthRulesUsingDrools(@Body AuthRequest request) {
        return service.getAuthRulesUsingDrools(request);
    }

    @Post(value ="/without-drools", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public AuthResponse getAuthRulesWithoutUsingDrools(@Body AuthRequestv2 request) {
        return service.getAuthRulesWithoutUsingDrools(request);
    }
}
