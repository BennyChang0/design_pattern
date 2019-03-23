package com.imooc.design.pattern.behavioral.observer.guava;

import com.google.common.eventbus.Subscribe;

public class CourseEvent {
    private Course course;

    public CourseEvent(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Subscribe
    public void subscribe(Question question) {
        System.out.println(course.getTeacher().getTeacherName() + "老师的" + course.getCourseName() + "课程接收到一个" + question.getUserName() + "提交的问答:" + question.getQuestionContent());
    }
}
