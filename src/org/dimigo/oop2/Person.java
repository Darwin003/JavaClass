package org.dimigo.oop2;

public class Person {
    //private final String type = "포유류";
    private final String birthDate;
    private String name;

    public static final String TYPE = "포유류";

    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "type='" + TYPE + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20020101", "홍길동");
        Person p2 = new Person("20020101", "청길서");

        System.out.println(p1);
        System.out.println(p2);
    }
}
