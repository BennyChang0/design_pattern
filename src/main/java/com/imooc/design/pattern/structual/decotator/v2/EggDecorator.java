package com.imooc.design.pattern.structual.decotator.v2;

public class EggDecorator extends AbstractDecorator {
    public EggDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋1元";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
