package com.imooc.design.pattern.structual.decotator.v2;

public class Test {
    public static void main(String[] args) {
        AbstractBatterCake batterCake = new BatterCake();
        batterCake = new EggDecorator(batterCake);
        batterCake = new SausageDecorator(batterCake);
        batterCake = new SausageDecorator(batterCake);
        System.out.println(batterCake.getDesc() + "，价格：" + batterCake.cost());
    }
}
