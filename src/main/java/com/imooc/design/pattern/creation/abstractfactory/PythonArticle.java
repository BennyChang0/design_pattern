package com.imooc.design.pattern.creation.abstractfactory;

public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
