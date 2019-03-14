package com.imooc.design.principle.liskovsubstitution;

/**
 *
 * 里氏替换原则
 * 引申含义：子类可以扩展父类的功能，但不能改变父类原有的功能
 * 1、子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法
 * 2、子类可以增加自己特有的方法
 * 3、子类的方法重载父类方法时，方法的前置条件（方法的入参/输入）要比父类方法的输入参数更宽松
 * 4、子类的方法实现父类方法时（重写/重载或实现抽象方法），方法的后置条件（即方法的输出/返回值），要比父类更加严格或相等
 *
 *
 * 优点1：约束继承泛滥，开闭原则的一种体现
 * 优点2：程序健壮性、兼容、扩展
 *
 */
public class Test {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() < rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width:"+ rectangle.getWidth() + ",length:" + rectangle.getLength());
        }

        System.out.println("resize方法结束 width:"+ rectangle.getWidth() + ",length:" + rectangle.getLength());
    }

//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(10);
//        rectangle.setLength(20);
//        resize(rectangle);
//    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);

        // 原先Square继承Rectangle，违反里氏替换原则
//        Square square = new Square();
//        square.setSideLength(10);
//        resize(square);
    }
}
