package item05.withspring;

import item05.factorymethod.DefaultDictionary;

public class DefaultDictionaryFactory implements DictionaryFactory {

    private final Dictionary dictionary;


    public DefaultDictionaryFactory(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public Dictionary getDictionary() {
        return this.dictionary;
    }

}
