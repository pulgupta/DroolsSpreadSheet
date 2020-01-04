package com.pulgupta.demo.service;

import com.pulgupta.demo.model.*;
import io.micronaut.context.annotation.Property;

import javax.inject.Singleton;
import java.util.List;

@Singleton
public class RuleEngine {

    @Property(name = "auth.rules")
    List<Rule> rules;

    public AuthResponse executeRules (AuthRequestv2 request) {
        Action action = null;
        for(Rule rule : rules) {
            Condition condition = rule.getCondition();
            if(condition.getStatuses().contains(request.getStatus())) {
                if(condition.getRoles().contains(request.getRole()) || condition.getRoles().equals("ANY")) {
                    action = rule.getAction();
                }
            }
        }
        if(action!=null) {
            return AuthResponse.responseFactory(action.getPermissions());
        }
        return new AuthResponse();
    }
}
