package com.imooc.design.principle.compositionaggregation;

public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MysqlConnection());
        productDao.addProduct();
    }
}