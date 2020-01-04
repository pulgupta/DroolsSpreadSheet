package com.pulgupta.demo.model;

import java.util.List;

public class Action {
    private List<String> permissions;

    public Action() {
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
}
