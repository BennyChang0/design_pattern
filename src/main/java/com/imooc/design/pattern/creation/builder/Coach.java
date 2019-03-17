package com.imooc.design.pattern.creation.builder;

public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String coursePPT, String courseVideo, String courseArticle, String courseQA) {
        courseBuilder.buildCoursePPT(coursePPT)
                .buildCourseName(courseName)
                .buildCourseVideo(courseVideo)
                .buildCourseArticle(courseArticle)
                .buildCourseQA(courseQA);
        return this.courseBuilder.makeCourse();
    }
}
