package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        Calculator cal = new Calculator(num1, num2);

        cal.powerOn();
        System.out.println(num1 + " + " + num2 + " = " + cal.add());
        System.out.println(num1 + " - " + num2 + " = " + cal.sub());
        System.out.println(num1 + " * " + num2 + " = " + cal.mul());
        System.out.println(num1 + " / " + num2 + " = " + cal.div());
        cal.powerOff();

        //쌉가능
//        System.out.printf("%d + %d = %d\n", num1, num2, cal.add());
//        System.out.printf("%d - %d = %d\n", num1, num2, cal.sub());
//        System.out.printf("%d - %d = %d\n", num1, num2, cal.mul());
//        System.out.printf("%d - %d = %.1f\n", num1, num2, cal.div());
    }
}
