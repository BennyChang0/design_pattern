package com.imooc.design.pattern.creation.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {
//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//
//        System.out.println("program end");


//        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(hungrySingleton);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        HungrySingleton newHungrySingleton = (HungrySingleton) ois.readObject();
//        System.out.println(hungrySingleton);
//        System.out.println(newHungrySingleton);
//        // 添加readResolve方法就为true，否则为false
//        System.out.println(hungrySingleton == newHungrySingleton);


//        Class objectClass = HungrySingleton.class;
//        Class objectClass = StaticInnerClassSingleton.class;
//        Class objectClass = LazySingleton.class;
//
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);

//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();

//        LazySingleton instance = LazySingleton.getInstance();
//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);



        // ObjectOutputStream
        // 枚举类型的序列化和反序列化

//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(instance.getData() == newInstance.getData());

        // 枚举类型的反射 Construct
        // jad 反编译工具
//        Class objectClass = EnumInstance.class;
//        Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);
//        constructor.setAccessible(true);
//        // Cannot reflectively create enum objects 枚举不能反射
//        EnumInstance instance = (EnumInstance) constructor.newInstance("benny", 666);

        EnumInstance.getInstance().printTest();
    }
}
