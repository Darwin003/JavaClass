package org.dimigo.pabixTest;

import java.util.Scanner;

public class star1 {
    public static void main(String[] args) {
        int i,j;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n; j++)
            {
                if(i == 1 || i == n || j == 1 || j == n)
                {
                    System.out.printf("*");
                } else if(i==j || j == n-i+1)
                {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }
}
