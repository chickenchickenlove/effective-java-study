package item05.dependencyinjection;

import item05.Dictionary;

import java.util.List;

public class SpellChecker {

    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
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
