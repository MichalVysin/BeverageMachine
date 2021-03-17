package com.company;

public class Main {

    public static void main(String[] args) {

        BeverageMaker beverageMaker = new BeverageMaker();
        beverageMaker.addBeverage(new Tea());
        beverageMaker.addBeverage(new Coffee());
        beverageMaker.addBeverage(new ChineseSoup());
        beverageMaker.setCupSize(CupSize.BIG);
        System.out.println(beverageMaker.prepare(3));

    }
}
