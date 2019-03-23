package com.imooc.design.pattern.behavioral.chainsofresposibility;

public abstract class Approver {
    protected Approver nextHandler;

    public void setNextApprover(Approver nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void deploy(Course course);
}
