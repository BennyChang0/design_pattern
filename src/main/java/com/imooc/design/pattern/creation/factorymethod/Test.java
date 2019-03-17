package com.imooc.design.pattern.creation.factorymethod;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        VideoFactory videoFactory2 = new JavaVideoFactory();
        VideoFactory videoFactory3 = new FEVideoFactory();

        Video video = videoFactory.getVideo();
        video.produce();
        video = videoFactory2.getVideo();
        video.produce();
        video = videoFactory3.getVideo();
        video.produce();
    }
}
