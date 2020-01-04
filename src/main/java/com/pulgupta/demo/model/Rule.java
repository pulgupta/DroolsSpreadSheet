package com.pulgupta.demo.model;

public class Rule {
    private Condition condition;
    private Action action;

    public Rule() {
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
