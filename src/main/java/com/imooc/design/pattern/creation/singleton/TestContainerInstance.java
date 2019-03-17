package com.imooc.design.pattern.creation.singleton;

public class TestContainerInstance {
    public static void main(String[] args) {
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();

        System.out.println("program end");
    }
}
