package org.dimigo.oop;

public class Calculator2 {


    // 생성자

    private boolean powerFlag = false;

    // 인스턴스 메소드 -
    public void powerOn() {
        if(!powerFlag) {
            System.out.println("전원을 켭니다.");
            powerFlag = true;
        }
    }

    public void powerOff() {
        if(powerFlag == true) {
            System.out.println("전원을 끕니다.");
        }
    }
    //인스턴스 멤버 - 객체를 생성해야만 사용할 수 있는 필드와 메소드.

    public static int add(int num1, int num2, Calculator2 c) { // add라는것도 인스턴스 메소드이기 때문에.. this를 생략해도 가능.
        c.powerOn();
        return num1+num2; // 나를 만든 '객체'에 접근함. this의 의미 - 인스턴스 메소드에서 this를 쓸수 있음. this는 객체를 가리킴.
    }

    public static int sub(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1-num2;
    }
    public static int mul(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1*num2;
    }

    public static double div(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return (double)num1/num2;
    }


}
