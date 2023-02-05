package org.example.item1;

import java.util.ArrayList;
import java.util.List;

/**
 * 이 클래스의 인스턴스는 #getInstance()를 사용한다.
 * @see Settings#getInstance()  // 다른 클래스를 참조하려면 # 앞에 클래스를 붙여준다. 만약 스스로를 참조하려면 # 앞에 클래스를 생략해도 된다.
 */
public class Settings {

    private boolean useAutoSteering;
    private boolean useABS;
    private Difficulty difficulty;

    /**
     * mvn javadoc:javadoc -> maven으로 Java Doc을 손쉽게 만들 수 있음.
     * target -> site -> apidocs -> index.html을 읽으면 만들어진 docs를 볼 수 있음.
     * 클래스 주석을 통해서 java doc이 만들어짐.
     */
    private Settings(boolean useAutoSteering, boolean useABS, Difficulty difficulty) {
        this.useAutoSteering = useAutoSteering;
        this.useABS = useABS;
        this.difficulty = difficulty;
    }

    private Settings() {
    }

    private static final Settings settings = new Settings();

    public static Settings getInstance() {
        // 이곳에서 필요한 로직을 넣을 수도 있다.
        return settings;
    }

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 = List.of();
    }

}
