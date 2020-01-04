package com.pulgupta.demo.service;

import com.pulgupta.demo.model.AuthRequest;
import com.pulgupta.demo.model.AuthRequestv2;
import com.pulgupta.demo.model.AuthResponse;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AuthService {

    @Inject
    KieContainer kieContainer;

    @Inject
    RuleEngine ruleEngine;

    public AuthResponse getAuthRulesUsingDrools(AuthRequest request) {
        AuthResponse response = new AuthResponse();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("response", response);
        kieSession.insert(request);
        kieSession.fireAllRules();
        kieSession.dispose();
        return response;
    }

    public AuthResponse getAuthRulesWithoutUsingDrools(AuthRequestv2 request) {
        return ruleEngine.executeRules(request);
    }

}
