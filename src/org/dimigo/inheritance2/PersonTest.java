package org.dimigo.inheritance2;

public class PersonTest {
    public static void main(String[] args) {
        Person tom = new Person();
        tom.setName("Tom");
        Person hong = new Korean("홍길동");
        Person danaka = new Japanese("다나카");
        Person wang = new Chinese("왕밍");

        System.out.println(tom);
        System.out.println(hong);
        System.out.println(danaka);
        System.out.println(wang);
        System.out.printf("\n");
        tom.sayHello();
        hong.sayHello();
        danaka.sayHello();
        wang.sayHello();
        System.out.printf("\n");
        tom.sayBye();
        hong.sayBye();
        danaka.sayBye();
        wang.sayBye();
    }
}
