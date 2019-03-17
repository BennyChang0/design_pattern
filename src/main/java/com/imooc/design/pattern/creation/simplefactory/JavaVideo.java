package com.imooc.design.pattern.creation.simplefactory;

public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
