package com.imooc.design.pattern.structual.decotator.v2;

public class BatterCake extends AbstractBatterCake {
    @Override
    protected String getDesc() {
        return "煎饼8元";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
