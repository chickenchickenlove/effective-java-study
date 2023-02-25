package item03.number4;

public enum Elvis implements IElvis{
    INSTANCE, HELLO;

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public void sing() {
        System.out.println("I'll have a blue~ Christmas without you~");
    }


    public static void main(String[] args) {
        Elvis instance = Elvis.INSTANCE;
        System.out.println(instance);
        Elvis hello = Elvis.HELLO;
        System.out.println(hello);

    }

}
