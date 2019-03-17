package com.imooc.design.pattern.creation.simplefactory;

public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
