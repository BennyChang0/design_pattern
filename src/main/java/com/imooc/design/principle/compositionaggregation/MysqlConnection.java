package com.imooc.design.principle.compositionaggregation;

public class MysqlConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MysqlConnection";
    }
}
