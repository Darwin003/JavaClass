package org.dimigo.abstractclass;

public abstract class Animal {
    public void eat() {
        System.out.println("냠냠");
    }
    //추상메소드 - 구현부 없음. 무조건 오버라이딩 하라
    public abstract void bark();
}
