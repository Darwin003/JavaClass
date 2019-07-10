package org.dimigo.interfaces;

// 인터페이스 : 하나의 표준, 규약, 명세 - 추상 메소드만 Only
// abstract IAnimal = 그냥 메소드도 가능함

public interface IAnimal {

    // 상수처리 (public static final)
    String FARM_NAME = "디미 동물농장";

    //추상메소드 선언
//    public abstract void eat();
    void bark();    // public abstract 자동 붙임

    //JDK 8부터 추가(디폴트 메소드 추가, interface임에도 메소드 내부 구현 가능) 본연의 의미가 퇴색됨
    default public void eat() {
        System.out.println("냠냠");
    }
    //static 메소드 가능 (인터페이스에서 구성 가능해짐)
    static void welcome() {
        System.out.println(FARM_NAME + "에 오실걸 환영합니다.");
    }
}
