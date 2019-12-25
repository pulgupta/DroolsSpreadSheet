package com.pulgupta.demo.model;

public class AuthResponse {
    private boolean edit;
    private boolean view;
    private boolean submit;

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
}
