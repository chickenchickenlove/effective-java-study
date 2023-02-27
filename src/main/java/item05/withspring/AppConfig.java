package item05.withspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DictionaryFactory dictionaryFactory(Dictionary dictionary) {
        return new KoreanDictionaryFactory(dictionary);
    }
    @Bean
    public Dictionary dictionary() {
        return new KoreanDictionary();
    }
}
