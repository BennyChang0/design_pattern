package com.imooc.design.pattern.creation.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private static boolean flag = true;
    private LazySingleton() {
//        if (lazySingleton != null) {
//            // 多线程场景下跟顺序有关系，先后顺序会导致检查失效
//            // 因此懒汉式对反射无能为力
//            throw new RuntimeException("单例私有构造器禁止调用反射");
//        }
        if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("单例私有构造器禁止调用反射");
        }
    }

    public synchronized static LazySingleton getInstance() {
//    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }

    public static void main(String[] args) throws Exception {
        Class objectClass = LazySingleton.class;
        Constructor c = objectClass.getDeclaredConstructor();
        c.setAccessible(true);

        LazySingleton o1 = LazySingleton.getInstance();

        Field flag = o1.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.setBoolean(o1, true);

        LazySingleton o2 = (LazySingleton) c.newInstance();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);
    }
}
