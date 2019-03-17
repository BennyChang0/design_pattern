package com.imooc.design.pattern.creation.abstractfactory;

/**
 * 抽象工厂关注产品族
 * 如果增加不同的产品等级，将违背开闭原则
 */
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}
