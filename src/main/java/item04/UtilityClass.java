package item04;

public abstract class UtilityClass {

    public UtilityClass() {
        System.out.println("UtilityClass Constructor calls");
    }

    public static String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        System.out.println(UtilityClass.hello());
    }
}
