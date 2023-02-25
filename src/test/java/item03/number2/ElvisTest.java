package item03.number2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class ElvisTest {

    @Test
    void reflectionTest() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Elvis> declaredConstructor = Elvis.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Elvis elvis1 = declaredConstructor.newInstance();
        Elvis elvis2 = declaredConstructor.newInstance();
        assertFalse(elvis1 == elvis2);
    }


    @Test
    void reflectionTest1() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Elvis> declaredConstructor = Elvis.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        assertThrows(InvocationTargetException.class, declaredConstructor::newInstance);
    }

}