package org.dimigo.oop;


public class StringTest {
    public static void main(String[] args) {
        //1. 문자열 리터럴방식 (Literal pool) 재사용 O - 주소 공유
        String dog1 = "멍멍이";
        String dog2 = "멍멍이";
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));

        //2. new 객체 생성방식
        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이");
        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));

        //문제
        System.out.println(dog1 == "멍멍이");
        System.out.println(cat1 == "야옹이");

        String id = "admin";
        if("admin".equals(id)) System.out.println("관리자");
        else System.out.println("관리자 아님");

        testString();

    }

    private static void testString() {
        //          01234567890123
        String s = "abcdefgABCDEFG";
        System.out.println(s.length());   // 14
        System.out.println(s.substring(3));  // defgABCDEFG
        System.out.println(s.substring(3,6));     // def
        System.out.println(s.indexOf("C"));  // C -> 9
        System.out.println(s.charAt(9)); // 9 -> C
        System.out.println(s.concat("    ABC     " ));
        System.out.println("        ABC         ".trim());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.replace('a', 'A'));
        System.out.println(s.startsWith("abc")); // "abc"로 시작하나?
        System.out.println(s.endsWith("fg"));
    }
}
