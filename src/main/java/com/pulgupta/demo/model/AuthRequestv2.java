package com.pulgupta.demo.model;

public class AuthRequestv2 {
    private String status;
    private String role;

    public AuthRequestv2() {
        super();
    }

    public AuthRequestv2(String status, String role) {
        this.status = status;
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public String getRole() {
        return role;
    }


}
