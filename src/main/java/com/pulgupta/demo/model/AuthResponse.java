package com.pulgupta.demo.model;

import java.util.List;

public class AuthResponse {
    private boolean edit;
    private boolean view;
    private boolean submit;
    private boolean approve;
    private boolean reject;

    public boolean isApprove() {
        return approve;
    }

    public void setApprove(boolean approve) {
        this.approve = approve;
    }

    public boolean isReject() {
        return reject;
    }

    public void setReject(boolean reject) {
        this.reject = reject;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

    public void setView(boolean view) {
        this.view = view;
    }

    public void setSubmit(boolean submit) {
        this.submit = submit;
    }

    public boolean isEdit() {
        return edit;
    }

    public boolean isView() {
        return view;
    }

    public boolean isSubmit() {
        return submit;
    }

    public static AuthResponse responseFactory(List<Permission> permissions) {
        AuthResponse authResponse = new AuthResponse();
        for(Permission permission: permissions) {
            switch (permission) {
                case VIEW:
                    authResponse.view=true;
                    break;
                case EDIT:
                    authResponse.edit=true;
                    break;
                case SUBMIT:
                    authResponse.submit=true;
                    break;
                case APPROVE:
                    authResponse.approve=true;
                    break;
                case REJECT:
                    authResponse.reject=true;
                    break;
            }
        }
        return authResponse;
    }
}
