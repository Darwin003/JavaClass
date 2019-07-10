package org.dimigo.oop;

public class StringTest2 {
    public static void main(String[] args) {
        // String으로 문자열 생성
        String str = "디미고 ";
        str += "2학년 ";
        str += "4반 ";
        str += "박태훈";


        // StringBuilder, StringBuffer
        StringBuilder sb = new StringBuilder("디미고 ").append("2학년 ").append("4반 ").append("박태훈");
        System.out.println(sb.toString());

        compareSpeed();
    }

    private static void compareSpeed() {
        //실행속도 확인
        long start = System.currentTimeMillis();
        String str = "abc";
        StringBuffer sb = new StringBuffer(str);
        StringBuilder sb2 = new StringBuilder(str);

        for(int i = 0; i < 100000; i++)
        {
       //     str += "def";
            sb.append("def");
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
