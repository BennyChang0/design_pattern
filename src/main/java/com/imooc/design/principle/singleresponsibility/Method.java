package com.imooc.design.principle.singleresponsibility;

/**
 * 方法的单一职责
 */
public class Method {
    public void updateUserInfo(String username, String address) {
        username = "geely";
        address = "beijing";
    }

    public void updateUserInfo(String username, String... properties) {
        username = "geely";
//        address = "beijing";
    }

    public void updateUserName(String username) {
        username = "geely";
    }

    public void updateUserAddress(String address) {
        address = "beijing";
    }

//    public void updateUserInfo(String username, String address, boolean bool) {
//        if (bool) {
//            //
//        } else {
//
//        }
//    }
}
