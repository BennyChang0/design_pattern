package com.imooc.design.pattern.structual.decotator.v1;

public class BatterCakeWithEggSausage extends BatterCakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
