package com.pulgupta.demo.service;

import com.pulgupta.demo.model.AuthRequestv2;
import com.pulgupta.demo.model.AuthResponse;

public interface RuleEngine {
    AuthResponse executeRules (AuthRequestv2 request);
}
