package com.imooc.design.pattern.behavioral.observer.guava;

import com.google.common.eventbus.EventBus;

public class GuavaCourseEventTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("alpha");
        Course course = new Course("Java设计模式", teacher);

        Question question = new Question("benny", "Java的主函数如何编写");

        CourseEvent courseEvent = new CourseEvent(course);

        EventBus eventBus = new EventBus();
        eventBus.register(courseEvent);
        eventBus.post(question);
    }
}
