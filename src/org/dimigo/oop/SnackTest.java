package org.dimigo.oop;

public class SnackTest {

    public static void main(String[] args) {
        Snack[] arr = {
                new Snack("새우깡", "농심", 1100, 2),
                new Snack("콘칲", "크라운", 1200, 1),
                new Snack("허니버터칩", "해태", 1500, 4)

        };

        printArray(arr);
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i].calcPrice();
        }
        System.out.printf("총 구매 금액: %,d원", sum);
    }




    public static void printArray(Snack[] arr) {
        for(Snack value : arr) {
            System.out.println(value.toString());
        }
    }

}
