package com.imooc.design.pattern.creation.singleton;

/**
 * 每个线程单独一个对象，"单例"
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal =
            new ThreadLocal<ThreadLocalInstance>() {
                @Override
                protected ThreadLocalInstance initialValue() {
                    return new ThreadLocalInstance();
                }
            };

    private ThreadLocalInstance() {
    }

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstanceThreadLocal.get();
    }
}
