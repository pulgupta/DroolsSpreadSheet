package com.pulgupta.demo.model;

import java.util.List;

public class Action {
    private List<Permission> permissions;

    public Action() {
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
