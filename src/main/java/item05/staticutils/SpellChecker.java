package item05.staticutils;

import item05.Dictionary;

import java.util.List;

public class SpellChecker {

    private static final Dictionary dictionary = new Dictionary();

    private SpellChecker() {
    }

    public static boolean isValid(String word) {
        // TODO : SpellChecker 코드 로직 구현
        return dictionary.contains(word);
    }

    public static List<String> suggestions(String typo) {
        // TODO : SpellChecker 코드 로직 구현
        return dictionary.closeWordsTo(typo);
    }
}
