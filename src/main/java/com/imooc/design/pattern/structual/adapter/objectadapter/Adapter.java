package com.imooc.design.pattern.structual.adapter.objectadapter;

/**
 * 对象适配
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
