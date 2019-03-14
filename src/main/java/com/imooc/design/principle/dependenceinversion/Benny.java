package com.imooc.design.principle.dependenceinversion;

public class Benny {
    private ICourse iCourse;

    public void setICourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }
}
