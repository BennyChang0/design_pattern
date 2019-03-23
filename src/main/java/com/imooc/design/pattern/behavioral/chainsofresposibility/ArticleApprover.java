package com.imooc.design.pattern.behavioral.chainsofresposibility;

public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (course.getArticle() != null && course.getArticle().trim().length() > 0) {
            System.out.println(course.getName() + "含有手记，批准");
            if (nextHandler != null) {
                nextHandler.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不包含手记，不批准，流程结束");
        }
    }
}
