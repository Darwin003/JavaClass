package org.dimigo.oop;

public class WrapperTest {
    public static void main(String[] args) {
        // Wrapper 클래스 : Primitive Type을 객체화시켜주는 클래스
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE); // int형은 32비트 = 4바이트

        System.out.println(Integer.toBinaryString(20));
        System.out.println(Integer.toOctalString(20));
        System.out.println(Integer.toHexString(10));


        // Boxing
        // 1) 생성자

        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1.equals(i2));

        // 2) valueOf()

        Integer i3 = Integer.valueOf(100);
        Double d1 = Double.valueOf(3.14);


        // 3) Unboxing
        int r1 = i3.intValue();
        double r2 = d1.doubleValue();


        // 문자열 -> Primitive Data Type -> ParseXxx
        int p1 = Integer.parseInt("200");
        double p2 = Double.parseDouble("3.14");


        System.out.println(args[0]);    // "100"
        System.out.println(args[1]);    // "200"

        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));

        Integer a = new Integer(1000);
        Integer b  = new Integer(2000);
        System.out.println(a+b);
        Integer c = 1000;
        int d = c + 2000;

        // 총 몇번의 autoBoxing과 autoUnBoxing이 일어나는가?
        Integer obj1 = 10; // 오박 1
        Integer obj2 = obj1 + 20; // 오박 1, 오언박 1
        Integer result = obj1 + obj2; // 오박1, 오언박 2

    }
}
