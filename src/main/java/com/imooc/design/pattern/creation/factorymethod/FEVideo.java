package com.imooc.design.pattern.creation.factorymethod;

public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制FE课程视频");
    }
}