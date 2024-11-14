package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        System.out.println("백만원은 " + toDollar(won) + "달러입니다.");
        
        //100달려를 원으로 출력하기
        System.out.println("백만원은 " + toKWR(dollar) + "달러입니다.");
        
    }

}
