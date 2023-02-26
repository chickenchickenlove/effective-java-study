package item05.factorymethod;

public class KoreanDictionaryFactory implements DictionaryFactory{

    @Override
    public Dictionary getDictionary() {
        return new KoreanDictionary();
    }
}
