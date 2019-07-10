package org.dimigo.oop;



public class BookTest2 {
    // static은 또다른 static끼리 바로 연결 가능하다
    private static void compare() {
        Book book = new Book();
        book.setTitle("수학의 바이블");
        Book book2 = book;
        System.out.println(book.getTitle());
        int a = 10;
        int b = a;
        System.out.println(a == b ? "true" : "false");

        System.out.println(book == book2 ? "true" : "false");
        System.out.println(book2.getTitle());


    }
    public static void main(String[] args) {
        compare();
        System.out.println("------------------------");
        int num = 5;
        methodA(num);
        System.out.println(num);
        Book book = new Book("Word Master");
        methodB(book);

        System.out.println(book.getTitle());

        System.out.println("------------------------");
        methodC(book);
        System.out.println(book.getTitle());

        Book book2 = new Book("미생");
        System.out.println(book2.getTitle().length());

    }

    private static void methodC(Book book) {
        book.setTitle("생존코딩");
        System.out.println(book.getTitle());
    }

    private static void methodB(Book book) {
        System.out.println(book.getTitle());
        book = new Book("이것이 자바다");
    }

    private static void methodA(int num) {
        num += 10;
        System.out.println(num);
    }
}
