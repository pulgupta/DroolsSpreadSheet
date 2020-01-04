package com.pulgupta.demo.model;

import java.util.List;

public class Condition {
    private List<String> statuses;
    private List<String> roles;

    public Condition() {
    }

    public List<String> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<String> statuses) {
        this.statuses = statuses;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
