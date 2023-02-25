package item03.number2;

import java.io.*;

public class ElvisSerialization {

    public static void main(String[] args) {

        // 직렬화를 통해 객체 정보를 파일에 저장.
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))) {
            out.writeObject(Elvis.INSTANCE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 역직렬화를 통해 파일로부터 객체 정보를 읽어옴.
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))) {
            // readObject()를 이용해서 객체를 읽어오면, 클래스 내부에 있는 readResolve()를 바탕으로 인스턴스를 읽어옴.
            Elvis elvis3 = (Elvis) in.readObject();
            System.out.println(elvis3 == Elvis.INSTANCE);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
