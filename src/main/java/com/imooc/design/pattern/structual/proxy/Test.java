package com.imooc.design.pattern.structual.proxy;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        // orderService 就是代理对象
        IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).getProxy();
        orderService.saveOrder(order);
    }
}
