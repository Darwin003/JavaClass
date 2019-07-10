package org.dimigo.basic;

public class PrimitiveDataType {
    public static void main(String[] args) {
        // 1. 논리형
        // Boolean은 선언 시 자동 0이나 전역변수에 한해서만 자동으로 0이 Default값이 됨. 지역변수에서는 초기화가 필수
        // 2. 문자형
        // char는 유니코드 0~127은 아스키문자 Default값은 공백이다(space).
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';
        System.out.printf("%c %c %c", c1, c2, c3);
        System.out.println('뷁');

        //문자열
        String name = "Human";
        System.out.println("My name is " + name);

        // 3. 정수형 byte (-128 ~ 127)
        int i1 = 10;
        int i2 = 0b0001010;
        int i3 = 012;
        int i4 = 0x0A;
        System.out.printf("%d %d %d %d", i1, i2, i3, i4);
        byte b1 = -128;
        byte b2 = 127;

        b1--;
        b2++;
        System.out.printf("%d %d", b1, b2);
        // 정수의 범위
        System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE+ "~" + Integer.MAX_VALUE);

        // 100억 저장
        long l = 10000000000L;

        // 4. 실수형
        float f1 = 3.14F;
        double d1 = 3.14D;

        //실수 정밀도 테스트
        float f2 = 0.12345678901234567890F;
        double d2 = 0.12345678901234567890;
        System.out.println(f2);
        System.out.println(d2);


        System.out.printf("\n%c, %d, %.2f, %s\n", 'A', 100, 12.345, "안농?");

    }
}
