package com.imooc.design.pattern.behavioral.templatemethod;

public abstract class ACourse {
    protected final void makeCourse() {
        // 制作课程分成以下三步
        makePPT();
        makeVideo();
        if (needWriteArticle()) {
            writeArticle();
        }

        packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("制作手机");
    }

    /**
     * 钩子方法
     * @return
     */
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();

}
