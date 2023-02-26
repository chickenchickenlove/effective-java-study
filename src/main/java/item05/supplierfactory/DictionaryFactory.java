package item05.supplierfactory;

import item05.DefaultDictionary;
import item05.Dictionary;

public class DictionaryFactory {

    public Dictionary getDictionary() {
        return new DefaultDictionary();
    }

    public static Dictionary getDictionaryStatic() {
        return new DefaultDictionary();
    }

}
