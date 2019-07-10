package org.dimigo.collection;

import org.dimigo.inheritance.Dog;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        //1. list계열 : ArrayList
//        List list = new ArrayList();
//        list.add("나자바");
//        list.add(100);
//        list.add(new Dog("멍멍이"));
//
//        String str = (String)list.get(0); // 예전방식
        // <> : 제네릭, <?> ? 데이터만 들어가는 리스트다!
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("달기");
        list.add(1, "포도");
        list.set(2, "바나나");

        printList(list);

        System.out.println(list.get(list.size()-1));
        list.remove(0);
        printList(list);

        list.remove("딸기");
        printList(list);
        list.clear(); // 전체삭제
        printList(list);

    }

    private static void printList(List<String> list) {

        for(String s : list) {
            System.out.println(s + " | ");
        }
        System.out.println();
    }
}
