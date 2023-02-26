package item05.factorymethod;

import java.util.List;

public interface Dictionary {
    boolean contains(String word);
    List<String> closeWordsTo(String typo);
}
