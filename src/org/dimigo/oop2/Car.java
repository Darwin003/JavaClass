package org.dimigo.oop2;

public class Car {
    // 정적 필드
    private static String company;


    // 인스턴스 필드
    private String name;

    //Static Block
    static {
        company = "기아";
        System.out.println("Static block 호출");
    }

    public Car(String name) {
        this.name = name;
        System.out.println("생성자 출력");
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Car.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return company + " : " + name;
    }
}
