package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BasicException {
    public static void main(String[] args) {
        try {
            uncheckedException(null);
            checkedException();
            String id = null;
            validate(id);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validate(String id) throws Exception{ // 2번째 방법 throws, 위에서 해결하라!
        try { // ttry catch 방법 1
            if (id == null || "".equals(id)) {
                Exception e = new Exception("ID를 입력하세요");
                throw e; // 여기다ㅏ아아ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ
            }
            if (id.length() < 8) {
                throw new Exception("8자 이상 입력하세요");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

//    컴파일러가 강제적으로 예외처리를 요구하지 않음
//    개발자가 알아서 예외처리를 해줘야 함


    private static void uncheckedException(String s) {
        try {
//            System.out.println(s.length()); //NullPointerException
            //NullPointerException npe = new NullPointerException()
            Integer.parseInt("123a"); //NumberFormatException
        } catch (NullPointerException npe){
            System.out.println("문자열이 입력되지 않았습니다");
        } catch(NumberFormatException nfe) {
            System.out.println("숫자가 아닙니다.");
            nfe.printStackTrace(); // 개발자 로그에는 익셉션 오류 뜨게, 사용자에게는 메시지
        } catch (Exception e) {
            System.out.println("알 수 없는 오류입니다.");
        }
    }


//    강제로 예외처리 하라!
//    컴파일러가 강제적으로 예외처리를 요구함
//    개발자가 알아서 예외처리를 해줘야 함
    private static void checkedException() {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("input.txt"));
            String str;
            while((str = br.readLine()) != null);
        } catch(FileNotFoundException fne) {
            System.out.println("파일이 없습니다.");

        } catch(IOException ie) {
            System.out.println("파일 리딩 시 오류 발생");
        }
    }

}
