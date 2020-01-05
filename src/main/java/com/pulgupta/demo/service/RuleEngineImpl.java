package com.pulgupta.demo.service;

import com.pulgupta.demo.model.*;
import io.micronaut.context.annotation.Property;

import javax.inject.Singleton;
import java.util.List;

@Singleton
public class RuleEngineImpl implements RuleEngine{

    @Property(name = "auth.rules")
    List<Rule> rules;

    @Override
    public AuthResponse executeRules (AuthRequestv2 request) {
        Action action = null;
        for(Rule rule : rules) {
            Condition condition = rule.getCondition();
            if(condition.getStatuses().contains(request.getStatus())) {
                if(condition.getRoles().equals("ANY") || condition.getRoles().contains(request.getRole())) {
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
