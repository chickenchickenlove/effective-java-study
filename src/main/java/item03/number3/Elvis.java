package item03.number3;

import item03.number2.IElvis;

import java.io.Serializable;
import java.util.function.Supplier;

public class Elvis implements IElvis, Serializable, Singer {

    private static final Elvis INSTANCE = new Elvis();
    public static boolean created;
    public static Elvis getInstance() {
        return new Elvis();
//        return INSTANCE;
    }

    private Elvis() {
    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public void sing() {
        System.out.println("I'll have a blue~ Christmas without you~");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();

        // getInstance()를 살짝 수정하면, 싱글턴 -> 매번 새로운 객체로 바꾼다.
        // 클라이언트 코드에 영향을 주지 않고 동작을 바꿀 수 있게 됨.
        System.out.println(Elvis.getInstance());
        System.out.println(Elvis.getInstance());
    }

    private Object readResolve() {
        return INSTANCE;
    }

}
