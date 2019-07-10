package org.dimigo.oop;

public class CarTest2 {

    public static void main(String[] args) {
        Car2 car1 = new Car2("현대자동차", "제네시스", "검정", 225, 50000000);
        Car2 car2 = new Car2("기아자동차", "K7", "흰", 246, 40000000);
        Car2 car3 = new Car2("삼성자동차", "SM7", "회", 200, 38000000);
        System.out.println("<< 자동차 목록 >>");
        System.out.printf("제조사명 : %s\n모델명 : %s\n색상 : %s색\n최대속도 : %dkm\n가격 : %,d원\n\n", car1.getCompany(), car1.getModel(), car1.getColor(), car1.getMaxSpeed(), car1.getPrice());
        System.out.printf("제조사명 : %s\n모델명 : %s\n색상 : %s색\n최대속도 : %dkm\n가격 : %,d원\n\n", car2.getCompany(), car2.getModel(), car2.getColor(), car2.getMaxSpeed(), car2.getPrice());
        System.out.printf("제조사명 : %s\n모델명 : %s\n색상 : %s색\n최대속도 : %dkm\n가격 : %,d원", car3.getCompany(), car3.getModel(), car3.getColor(), car3.getMaxSpeed(), car3.getPrice());




    }


}
