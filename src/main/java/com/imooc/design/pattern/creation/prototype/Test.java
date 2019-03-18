package com.imooc.design.pattern.creation.prototype;

public class Test {
    public static void main(String[] args) throws Exception {
        Mail mail = new Mail();
        mail.setContent("初始化模板");

        System.out.println("初始化mail:" + mail);

        for (int i = 0; i < 2; i++) {
            // TODO 克隆不会调用构造器
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@imooc.com");
            mailTemp.setContent("恭喜您，此次慕课网活动中奖了");
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆的mailTemp:" + mailTemp);
        }

        MailUtil.saveOriginMailRecord(mail);
    }
}
