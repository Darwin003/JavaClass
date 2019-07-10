package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        //int 타입 이차원 배열
        int[][] intArr = new int[2][3];


        intArr[0][2] = 1;
        intArr[1][1] = 2;
        printArray(intArr);

        //String 타입 이차원 배열
//        String strArr[][] = {
//                new String[3],
//                new String[2]
//        };

        String strArr[][] = new String[2][];
        strArr[0] = new String[3];
        strArr[1] = new String[2];

        strArr[0][0] = "C";
        strArr[0][1] = "Java";
        strArr[0][2] = "PHP";
        strArr[1][0] = "C#";
        strArr[1][1] = "Python";

        printArray(strArr);

        String[][] strArr2 = {
                {"C", "JAVA", "PHP"},
                {"C#", "Python"}
        };

        String[][] strArr3 = {
          new String[] {"C", "JAVA", "PHP"},
                new String[] {"C#", "Python"}

        };

        String[][] strArr4 = new String[][]{
                new String[] {"C", "JAVA", "PHP"},
                new String[] {"C#", "Python"}

        };

        printArray(strArr2);
        printArray(strArr3);
    }

    private static void printArray(int[][] intArr) {
        // 이중 for문 출력
//        for(int i=0; i<intArr.length; i++)
//        {
//            for(int j=0; j<intArr[i].length; j++)
//            {
//                System.out.println(intArr[i][j]);
//            }
//        }
        // for-each문 이용
        for( int[] arr : intArr)
        {
            for( int value : arr) {
                System.out.print(value + " | ");
            }
        }

    }

    private static void printArray(String[][] strArr) {
        for(String[] arr : strArr)
        {
            for(String value : arr)
            {
                System.out.println(value);
            }
        }
    }
}
