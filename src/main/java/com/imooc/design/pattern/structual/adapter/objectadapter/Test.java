package com.imooc.design.pattern.structual.adapter.objectadapter;

public class Test {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
