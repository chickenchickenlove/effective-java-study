package item04;

public class UtilityPrivateClass {

    private UtilityPrivateClass() {
        /**
         * Creation of UtilityPrivateClass instance is forbidden.
         */

        System.out.println("UtilityPrivateClass Constructor calls");
        throw new AssertionError();
    }

    public static String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        System.out.println(UtilityPrivateClass.hello());
    }
}
