package org.dimigo.oop;

public class Calculator {
    //인스턴스 - 객체가 있는 상태에만 실행됨.
    // 인스턴스 메소드에는 this를 붙일수 있음.
    // 필드
    //Static이 없는 필드는 인스턴스 필드.
    private int num1;
    private int num2;
    private boolean powerFlag = false;

    // 생성자
    public Calculator() {
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }



    // 인스턴스 메소드 -
    public void powerOn() {
        if(powerFlag == false) {
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

    public int add() { // add라는것도 인스턴스 메소드이기 때문에.. this를 생략해도 가능.
        this.powerOn();
        return this.num1+this.num2; // 나를 만든 '객체'에 접근함. this의 의미 - 인스턴스 메소드에서 this를 쓸수 있음. this는 객체를 가리킴.
    }

    public int sub() {
        this.powerOn();
        return num1-num2;
    }

    public int mul() {
        this.powerOn();
        return num1*num2;
    }

    public double div() {
        this.powerOn();
        return (double)num1/num2;
    }


}
