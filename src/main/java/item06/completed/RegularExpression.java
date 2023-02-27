package item06.completed;

import java.util.regex.Pattern;

public class RegularExpression {

    private static final Pattern SPLIT_PATTERN = Pattern.compile(",");
    private static final Pattern REPLACE_PATTERN = Pattern.compile("h");

    public static void main(String[] args) {

        // Split 관련
        long start = System.nanoTime();
        for (int j = 0; j < 10000; j++) {
            String name = "keesun,whiteship";

            // 패턴 인스턴스가 생성됨.
            name.split(",");

            // 대안 → 미리 생성해서 사용.
            SPLIT_PATTERN.split(name);
        }
        System.out.println(System.nanoTime() - start);

        // replace 관련
        String myString = "hello,hello,hello,hello,hello";
        String replaceString = REPLACE_PATTERN.matcher(myString).replaceAll("a");
        System.out.println("replaceString = " + replaceString);
    }
}
