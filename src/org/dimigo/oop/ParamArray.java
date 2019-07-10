package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        add(intArr, 10);
        printArray(intArr);

        String[] names = {"홍길동", "홍길서", "홍길남", "홍길북"};
        changeName(names);
        printArray(intArr);
        printArray(names); // 김길동, 김길서, 김길남, 김길북

        System.out.println();
    }

    private static void printArray(int[] intArr) {
        StringBuilder sb = new StringBuilder();
        for(int value : intArr) {
            sb.append(value + ", ");
        }

        System.out.println(sb.toString());
    }


    private static void printArray(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for(String value : strArr) {
            sb.append(value + ", ");
        }

        System.out.println(sb.toString());
    }

    private static void add(int[] intArr, int i) {
        for(int n = 0; n < intArr.length; n++)
        {
            intArr[n] += i;
        }
    }

    private static void changeName(String[] strArr) {
        for(int n = 0; n < strArr.length; n++)
        {
            strArr[n] = "김" + strArr[n].substring(1);
        }
    }
}
