package com.imooc.design.pattern.structual.decotator.v2;

public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个香肠2元";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
