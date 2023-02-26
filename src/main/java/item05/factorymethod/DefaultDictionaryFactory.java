package item05.factorymethod;

public class DefaultDictionaryFactory implements DictionaryFactory{

    @Override
    public Dictionary getDictionary() {
        return new DefaultDictionary();
    }
}
