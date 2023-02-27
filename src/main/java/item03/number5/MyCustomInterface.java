package item03.number5;

@FunctionalInterface
public interface MyCustomInterface<T> {

    // 메서드 선언
    T hello();

//    T hello2();

    static void helloDefault() {
        System.out.println("HELLO");
    }
}
