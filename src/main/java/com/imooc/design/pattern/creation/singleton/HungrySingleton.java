package com.imooc.design.pattern.creation.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable, Cloneable {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例私有构造器禁止调用反射");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    // 解决序列化和反序列的对象不一致问题，反序列化是使用反射创建新对象并返回
    // 加了这个方法后，在反序列会过程中被调用并返回原对象，而不是返回反射的新对象
    private Object readResolve() {
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 1.不要实现Cloneable接口
        // 2.实现Cloneable接口，并且重写clone()方法
        return getInstance();
    }
}
