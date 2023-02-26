package item05.supplierfactory;

import item05.Dictionary;

import java.util.List;
import java.util.function.Supplier;

public class SpellCheckerWithSupplierFactory {


    private final Dictionary dictionary;

    public SpellCheckerWithSupplierFactory(DictionaryFactory factory) {
        this.dictionary = factory.getDictionary();
    }

    public SpellCheckerWithSupplierFactory(Supplier<? extends Dictionary> factory) {
        this.dictionary = factory.get();
    }

    public boolean isValid(String word) {
        // TODO : SpellChecker 코드 로직 구현
        return dictionary.contains(word);
    }

    public  List<String> suggestions(String typo) {
        // TODO : SpellChecker 코드 로직 구현
        return dictionary.closeWordsTo(typo);
    }

    public static void main(String[] args) {



        SpellCheckerWithSupplierFactory spellCheckerWithSupplierFactory = new SpellCheckerWithSupplierFactory(DictionaryFactory::getDictionaryStatic);


    }

}
