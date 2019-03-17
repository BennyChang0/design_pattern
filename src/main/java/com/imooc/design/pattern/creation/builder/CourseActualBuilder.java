package com.imooc.design.pattern.creation.builder;

public class CourseActualBuilder extends CourseBuilder {
    private Course course = new Course();

    @Override
    public CourseActualBuilder buildCourseName(String courseName) {
        course.setCourseName(courseName);
        return this;
    }

    @Override
    public CourseActualBuilder buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
        return this;
    }

    @Override
    public CourseActualBuilder buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
        return this;
    }

    @Override
    public CourseActualBuilder buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
        return this;
    }

    @Override
    public CourseActualBuilder buildCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
        return this;
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
