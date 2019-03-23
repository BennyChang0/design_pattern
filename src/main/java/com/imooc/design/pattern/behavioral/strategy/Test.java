package com.imooc.design.pattern.behavioral.strategy;

public class Test {
//    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
//
//        promotionActivity618.executePromotionStrategy();
//        promotionActivity1111.executePromotionStrategy();
//    }

    public static void main(String[] args) {
        String promotionKey = "MANJIAN";
//        String promotionKey = "LIJIAN";
//        String promotionKey = "MANJIANxxx";

        PromotionStrategy promotionStrategy = PromotionActivityFactory.getPromotionStrategy(promotionKey);
        promotionStrategy.doPromotion();
    }
}
