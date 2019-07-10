package org.dimigo.oop2;

public class Singleton {

    private static Singleton instance;

    // 바깥에서 new로 생성불가
    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }


    //Lazy initialization // synchronized 동기화 처리 멀티스레드 환경에서 한 시점에서 딱 하나씩만 들어오게
    public static synchronized Singleton getInstance2() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;

    }

}