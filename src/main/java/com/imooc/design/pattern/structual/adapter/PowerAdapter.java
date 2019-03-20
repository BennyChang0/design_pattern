package com.imooc.design.pattern.structual.adapter;

public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5() {
        int adapterInput = ac220.outputAC220V();
        // changer
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入AC:" + adapterInput + "V, 输出DC:" + adapterOutput + "V");

        return adapterOutput;
    }
}
