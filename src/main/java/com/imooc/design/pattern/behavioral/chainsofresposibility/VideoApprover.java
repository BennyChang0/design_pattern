package com.imooc.design.pattern.behavioral.chainsofresposibility;

public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (course.getVideo() != null && course.getVideo().trim().length() > 0) {
            System.out.println(course.getName() + "含有视频，批准");
            if (nextHandler != null) {
                nextHandler.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不包含视频，不批准，流程结束");
        }
    }
}