package controliteration.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {


    @Test
    void findTranslations() {
        Dictionary dictionary = new Dictionary();
        dictionary.addItem("boy", Arrays.asList("nino", "chico"));
        List<String> translations = dictionary.findTranslations("boy");
        assertEquals(translations, dictionary.findTranslations("boy"));
    }

    @Test
    void addItem() {
        Dictionary dictionary = new Dictionary();
        List<String> translations1 = new ArrayList<>();
        translations1.add("nino");
        translations1.add("chico");
        dictionary.addItem("boy", translations1);

        List<String> translations2 = new ArrayList<>();
        translations2.add("chaval");
        translations2.add("chico");
        dictionary.addItem("boy", translations2);

        List<String> translations = dictionary.findTranslations("boy");
        assertEquals(translations, dictionary.findTranslations("boy"));

        List<String> emptyList = new ArrayList<>();
        assertEquals(emptyList, dictionary.findTranslations("fiú"));
    }
}