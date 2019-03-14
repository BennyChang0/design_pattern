package com.imooc.design.principle.openclose;

/**
 * 对扩展开放(扩展实现类)，对修改关闭(修改接口和修改基类)
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "java从零到企业级电商开发", 80D);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID:" + javaCourse.getId() + "，课程名称:" + javaCourse.getName() + "，课程原价:" + javaCourse.getPrice() + "，打折后价格:" + javaCourse.getDiscountPrice());
    }
}
