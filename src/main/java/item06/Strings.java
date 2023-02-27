package item06;

public class Strings {

    public static void main(String[] args) {
        String hello1 = "hello";
        String hello2 = new String("hello");
        String hello3 = "hello";

        System.out.println(hello1 == hello2);
        System.out.println(hello1.equals(hello2));


    }


}
