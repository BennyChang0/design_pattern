package com.imooc.design.pattern.creation.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .courseName("Java设计模式精讲")
                .courseArticle("Java设计模式手记")
                .coursePPT("Java设计模式PP")
                .courseVideo("Java设计模式Video")
                .courseQA("Java设计模式QA").build();

        System.out.println(course);
    }
}
