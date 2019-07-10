package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        //기본형 타입 배열
        // int, float, double, char, boolean, byte, long, short
        int[] intArr = null;
        intArr = new int[5];

        int[] intArr2 = {1,2,3,4,5};
            intArr2 = new int[] {1,2,3,4,5};
        printArray(intArr);
        printArray(intArr2);


        double doubleArr[] = null;
        doubleArr = new double[5];
        printArray(doubleArr);


        //참조형 타입 배열
        String[] strArr = new String[3];

        printArray(strArr);

        strArr[0] = "박재민";
        strArr[1] = "김가은";
        strArr[2] = "문진호";
        printArray(strArr);

        String[] strArr2 = new String[] {"ITZY", "소녀시대", "걸스데이"};
        printArray(strArr2);

        Book strBook[] = new Book[2];
        strBook[0] = new Book("수학의바이블", "김재영", 300);
        strBook[1] = new Book("수학의바이블2", "김재영2", 31208);


        printArray(strBook);

        Book strBook2[] = new Book[]{
                new Book("수학의 바이블3", "김재영5", 120),
                new Book("일고", "머리", 200)
        };

        printArray(strBook2);
        //배열 사용 시 주의사항!!!
        int[] intArr3 = new int[3];
        System.out.println(intArr3.length);
        System.out.println(intArr3[intArr3.length-1]);
        String[] strArr3 = new String[3];
        System.out.println(strArr3[0]);         // 널
//        System.out.println(strArr3[0].length()); // 널포인터익셉션

        Book[] bookArr3 = new Book[3];
        System.out.println(bookArr3[0]); // null
        System.out.println(bookArr3[0].getTitle());
    }

    private static void printArray(int[] intArr) {
        for(int value : intArr) { //중요
            System.out.println(value);

        }
    }
    private static void printArray(double[] doubleArr) {
        for(double value : doubleArr) { //중요
            System.out.println(value);

        }
    }
    private static void printArray(String[] stringArr) {
        for(String value : stringArr) { //중요
            System.out.println(value);

        }
    }
    private static void printArray(Book[] bookArr) {
        for(Book value : bookArr) { //중요

            System.out.println(value);
        }
    }
}
