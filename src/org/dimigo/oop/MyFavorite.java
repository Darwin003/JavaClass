package org.dimigo.oop;

import java.util.Random;
import java.util.Scanner;

public class MyFavorite {
    public static void main(String[] args) {
        String[] questions = {
                "가장 좋아하는 가수는?",
                "가장 좋아하는 배우는?",
                "가장 좋아하는 과목은?"
        };

        String[] answers = {
                "아이유",
                "원빈",
                "자료구조"
        };

        int select;
        Scanner scanner = new Scanner(System.in);
        do {


            System.out.println("------------------");
            System.out.println("1. 질문 선택");
            System.out.println("2. 정답 공개");
            System.out.println("9. 프로그램 종료");
            System.out.println("------------------");
            System.out.printf("메뉴 선택 => ");
            select = scanner.nextInt();

            switch(select){
                case 1:
                    int random = new Random().nextInt(3);
                    System.out.printf("%s ", questions[random]);
                    String str = scanner.next();
                    if(answers[random].equals(str))
                    {
                        System.out.println("정답입니다!");
                    } else {
                        System.out.println("틀렸습니다!");
                    }
                    break;
                case 2:

                    StringBuilder sb = new StringBuilder();
                    sb.append("<< 정답 출력 >>\n");
                    for(int i=0; i<3; i++)
                    {
                        sb.append(questions[i]).append(" ").append(answers[i]).append("입니다.\n");
                    }

                    System.out.printf("%s", sb);
                    break;

                case 9:
                    System.out.println("Bye~");
                    scanner.close();
                    break;

                default:
                    System.out.println("없는 메뉴입니다.");



            }


        } while(select != 9);

    }
}
