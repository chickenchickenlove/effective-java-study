package item05.withspring;


import item05.Dictionary;
import item05.supplierfactory.DictionaryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpellCheckerWithSpring {


    private final Dictionary dictionary;

    public SpellCheckerWithSpring(DictionaryFactory factory) {
        this.dictionary = factory.getDictionary();
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
