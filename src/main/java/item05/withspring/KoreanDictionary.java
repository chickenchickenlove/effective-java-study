package item05.withspring;

import java.util.List;

public class KoreanDictionary implements Dictionary {
    public boolean contains(String word) {
        return false;
    }

    public List<String> closeWordsTo(String typo) {
        return null;
    }
}
