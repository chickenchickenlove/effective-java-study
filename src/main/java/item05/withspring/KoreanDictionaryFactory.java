package item05.withspring;

public class KoreanDictionaryFactory implements DictionaryFactory {

    private final Dictionary dictionary;

    public KoreanDictionaryFactory(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public Dictionary getDictionary() {
        return this.dictionary;
    }
}
