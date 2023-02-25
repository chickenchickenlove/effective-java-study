package item05;

import java.util.List;

public class DefaultDictionary implements Dictionary{
    public boolean contains(String word) {
        return false;
    }

    public List<String> closeWordsTo(String typo) {
        return null;
    }
}
