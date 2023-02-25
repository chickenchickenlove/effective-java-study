package item04;

public class DefaultUtilityClass extends UtilityClass{

    public DefaultUtilityClass() {
        System.out.println("DefaultUtilityClass constructor called");
    }

    public static void main(String[] args) {
        DefaultUtilityClass defaultUtilityClass = new DefaultUtilityClass();
        System.out.println(defaultUtilityClass.hello());
    }
}
