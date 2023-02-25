package item05.staticutils;

import item05.Dictionary;

import java.util.List;

public class SpellChecker {

//    private static final Dictionary dictionary = new Dictionary();
    private static final KoreanDictionary dictionary = new KoreanDictionary();

    public static boolean isValid(String word) {
        // TODO : SpellChecker 코드 로직 구현
        return dictionary.containsKorean(word);
//        return dictionary.contains(word);
    }

    public static List<String> suggestions(String typo) {
        // TODO : SpellChecker 코드 로직 구현
        return dictionary.closeWordsToKorean(typo);
//        return dictionary.closeWordsTo(typo);
    }
}
