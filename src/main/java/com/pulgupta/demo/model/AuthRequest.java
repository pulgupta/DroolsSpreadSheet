package com.pulgupta.demo.model;

public class AuthRequest {
    private String banker;
    private String appStatus;

    public AuthRequest() {
        super();
    }

    public AuthRequest(String banker, String appStatus) {
        this.banker = banker;
        this.appStatus = appStatus;
    }

    public String getBanker() {
        return banker;
    }

    public String getAppStatus() {
        return appStatus;
    }


}
