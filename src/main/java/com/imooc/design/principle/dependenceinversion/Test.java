package com.imooc.design.principle.dependenceinversion;

public class Test {
    public static void main(String[] args) {
//          v1
//        Benny benny = new Benny();
//        benny.studyJavaCourse();
//        benny.studyFECourse();
//        benny.studyPythonCourse();

//          v2
//        Benny benny = new Benny();
//        benny.studyImoocCourse(new JavaCourse());
//        benny.studyImoocCourse(new FECourse());
//        benny.studyImoocCourse(new PythonCourse());

//          v3
//        Benny benny = new Benny(new JavaCourse());
//        benny.studyImoocCourse();

        Benny benny = new Benny();
        benny.setICourse(new JavaCourse());
        benny.studyImoocCourse();

        benny.setICourse(new PythonCourse());
        benny.studyImoocCourse();
    }
}
