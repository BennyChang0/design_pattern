package com.imooc.design.pattern.behavioral.templatemethod;

public class FECourse extends ACourse {
    private boolean needWriteArticle;

    public FECourse(Boolean needWriteArticle) {
        this.needWriteArticle = needWriteArticle;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return needWriteArticle;
    }
}
