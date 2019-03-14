package com.imooc.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaDiscountCourse(96, "java从零到企业级电商开发", 80D);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) javaCourse;
        System.out.println(javaDiscountCourse.getOriginPrice() + "," + javaDiscountCourse.getPrice());
    }
}
