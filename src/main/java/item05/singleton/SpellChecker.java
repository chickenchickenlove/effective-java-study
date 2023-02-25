package item05.singleton;

import item05.Dictionary;

import java.util.List;

public class SpellChecker {

    private final Dictionary dictionary = new Dictionary();
    public static final SpellChecker spellChecker = new SpellChecker();

    private SpellChecker() {
    }

    public boolean isValid(String word) {
        // TODO : SpellChecker 코드 로직 구현
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        // TODO : SpellChecker 코드 로직 구현
        return dictionary.closeWordsTo(typo);
    }
}
