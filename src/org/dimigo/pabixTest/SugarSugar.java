package org.dimigo.pabixTest;

import java.util.Scanner;

/*
미누기는 요즘 설탕공장에서 설탕을 배달하고 있다.
미누기는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지, 10킬로그램 봉지가 있다.
미누기는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다.
예를 들어, 18킬로그램 설탕을 배달해야 할 때,
3킬로그램 봉지 6개나, 5킬로그램 봉지 3개와 3킬로그램 봉지 1개를 가져가도 되지만, 10킬로그램 1개와 5킬로그램 1개, 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.

민욱이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.


입력값으로 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)

민욱이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
 */


/*
testcase 1)
input -> 18
output -> 3

testcase 2)
input -> 45
output -> 5

testcase 3)
input -> 6
output -> 2

testcase 4)
input -> 9
output -> 3

testcase 5)
input -> 11
output -> 3

testcase 6)
input -> 4821
output -> 484

testcase 7)
input -> 49
output -> 7

testcase 8)
input -> 117
output -> 15

testcase 9)
input -> 27
output -> 6

testcase 10)
input -> 7
output -> -1

testcase 11)
input -> 8
output -> 2

testcase 12)
input -> 31
output -> 5

testcase 13)
input -> 17
output -> 5

testcase 14)
input -> 4
output -> -1
 */


public class SugarSugar {
    public static void main(String[] args) {
        int N, B=0;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();

        while(true) {
            if( N%10 == 0 ) { System.out.println( N/10 + B ); break;
            } else if( N%5 == 0 ) { System.out.println( N/10 + ++B ); break;
            } else { N -= 3; B++; }

            if(N < 0) { System.out.println(-1); break;
            } else if(N == 0) { System.out.println(B); break; }
        }
    }
}
