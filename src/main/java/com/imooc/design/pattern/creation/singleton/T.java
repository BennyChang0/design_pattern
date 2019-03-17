package com.imooc.design.pattern.creation.singleton;

public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + ": " + lazySingleton);

//        ContainerSingleton.putInstance("object", new Object());
//        Object instance = ContainerSingleton.getInstance("object");

        ThreadLocalInstance threadLocalInstance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + threadLocalInstance);
    }
}
