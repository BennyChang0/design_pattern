package com.imooc.design.pattern.creation.singleton;

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
    }

    // Class对象的初始化锁
    private static class InnerClass {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }

    // 导致类初始化的方式
    // 1. 类的实例被初始化
    // 2. 类中声明的静态方法被调用
    // 3. 类中声明的静态成员被赋值
    // 4. 类中声明的静态成员被使用，并且不是常量成员

    // 5. 顶级类，有嵌套语言初始化（不常见）
}
