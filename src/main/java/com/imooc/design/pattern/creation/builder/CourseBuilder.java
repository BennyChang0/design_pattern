package com.imooc.design.pattern.creation.builder;

public abstract class CourseBuilder {
    public abstract CourseActualBuilder buildCourseName(String courseName);
    public abstract CourseActualBuilder buildCoursePPT(String coursePPT);
    public abstract CourseActualBuilder buildCourseVideo(String courseVideo);
    public abstract CourseActualBuilder buildCourseArticle(String courseArticle);
    public abstract CourseActualBuilder buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
