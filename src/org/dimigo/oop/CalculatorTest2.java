package org.dimigo.oop;

public class CalculatorTest2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        Calculator2 c = new Calculator2();
        Calculator2 c2 = new Calculator2();
        Calculator2 c3 = new Calculator2();
        //cal.powerOn();
        System.out.println(num1 + " + " + num2 + " = " + Calculator2.add(num1, num2, c));
        System.out.println(num1 + " + " + num2 + " = " + Calculator2.sub(num1, num2, c));
        System.out.println(num1 + " + " + num2 + " = " + Calculator2.mul(num1, num2, c));
        System.out.println(num1 + " + " + num2 + " = " + Calculator2.div(num1, num2, c));
        c.powerOff();
        //cal.powerOff();

        //쌉가능
//        System.out.printf("%d + %d = %d\n", num1, num2, cal.add());
//        System.out.printf("%d - %d = %d\n", num1, num2, cal.sub());
//        System.out.printf("%d - %d = %d\n", num1, num2, cal.mul());
//        System.out.printf("%d - %d = %.1f\n", num1, num2, cal.div());
    }
}
