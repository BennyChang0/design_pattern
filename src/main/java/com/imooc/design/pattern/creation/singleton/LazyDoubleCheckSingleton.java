package com.imooc.design.pattern.creation.singleton;

public class LazyDoubleCheckSingleton {
    // 使用volatile 关键字禁止重排序
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    // 1.分配内存给这个对象
                    // 3.设置 lazyDoubleCheckSingleton 指向刚分配的内存地址
                    // 2.初始化对象
                    // intra-thread semantics
                    // ---------- 3.设置 lazyDoubleCheckSingleton 指向刚分配的内存地址
                    // 解决方法：禁止2和3指令重排序；允许指令重排序，但其他线程看不到（静态内部类单例）
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
