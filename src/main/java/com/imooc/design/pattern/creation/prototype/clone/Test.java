package com.imooc.design.pattern.creation.prototype.clone;

import com.imooc.design.pattern.creation.singleton.HungrySingleton;

import java.lang.reflect.Method;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception {
//        Date birthday = new Date(0L);
//        Pig pig1 = new Pig("佩奇", birthday);
//        Pig pig2 = (Pig) pig1.clone();
//        System.out.println(pig1);
//        System.out.println(pig2);
//
//        pig1.getBirthday().setTime(1666666666666L);
//
//        System.out.println(pig1);
//        System.out.println(pig2);


        // 防止单例对象被克隆破坏
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);

        HungrySingleton newHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);

        System.out.println(hungrySingleton);
        System.out.println(newHungrySingleton);
    }
}
