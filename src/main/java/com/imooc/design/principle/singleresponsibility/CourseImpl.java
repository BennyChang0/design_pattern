package com.imooc.design.principle.singleresponsibility;

public class CourseImpl implements ICourseContent, ICourseManager {
    public String getCourseName() {
        return "获取课程名称";
    }

    public byte[] getCourseVideo() {
        return new byte[0];
    }

    public void studyCourse() {
        System.out.println("学习课程");
    }

    public void refundCourse() {
        System.out.println("退课");
    }
}
