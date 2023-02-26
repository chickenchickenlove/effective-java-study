package item05.factorymethod;

import java.util.List;
import java.util.function.Supplier;

    public class SpellCheckerWithFactoryMethod {

        private Dictionary dictionary;

        public SpellCheckerWithFactoryMethod(DictionaryFactory factory) {
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
