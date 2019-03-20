package com.imooc.design.pattern.structual.adapter.classadapter;

/**
 * 类适配
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
