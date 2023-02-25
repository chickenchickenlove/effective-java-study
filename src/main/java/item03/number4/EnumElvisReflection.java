package item03.number4;

import item03.number2.Elvis;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumElvisReflection {
    public static void main(String[] args) {
        try {
            // 생성자가 존재는 하지만 못 쓰게 되어있다. ENUM은 그렇게 구현되어있음.
            Constructor<item03.number4.Elvis> declaredConstructor = item03.number4.Elvis.class.getDeclaredConstructor();
            System.out.println(declaredConstructor);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
