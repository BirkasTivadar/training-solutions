package controliteration.dictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dictionary {

    private List<DictionaryItem> dictionaryItems = new ArrayList<>();

    public void addItem(String word, List<String> translations) {
        boolean found = false;
        for (DictionaryItem dictionaryItem : dictionaryItems) {
            if (dictionaryItem.getWord().equals(word)) {
                dictionaryItem.addTranslations(translations);
                found = true;
            }
        }
        if (!found) {
            dictionaryItems.add(new DictionaryItem(word, translations));
        }
    }

    public List<String> findTranslations(String word) {
        for (DictionaryItem dictionaryItem : dictionaryItems) {
            if (dictionaryItem.getWord().equals(word)) {
                return dictionaryItem.getTranslations();
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.addItem("kutya", Arrays.asList("pooch", "dog"));
        dictionary.addItem(("kutya"), Collections.singletonList("dawg"));

        List<String> translations = dictionary.findTranslations("kutya");
        System.out.println(translations);
    }
}
