package org.example.item1;

public interface HelloService {
    /**
     * 1. 리턴 타입이 인터페이스로 강제된다. -> 클라이언트는 강제적으로 인터페이스 타입을 사용한다.
     * 2. 외부로부터 구현 클래스 타입을 숨길 수 있다. -> 의존성이 줄어든다.
     */

    String hello();

    static String hi() {
        prepareMessage();
        return "hi";
    }

    static private void prepareMessage() {

    }

    static String hi1() {
        prepareMessage();
        return "hi";
    }

    static String hi2() {
        prepareMessage();
        return "hi";
    }

    static String hi3() {
        prepareMessage();
        return "hi";
    }



    static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloFactory();
        } else {
            return new EnglishHelloFactory();
        }
    }
}
