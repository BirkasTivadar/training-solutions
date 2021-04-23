package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class DictionaryItem {

    private String word;

    private List<String> translations = new ArrayList<>();

    public DictionaryItem(String word, List<String> translations) {
        this.word = word;
        this.addTranslations(translations);
    }

    public void addTranslations(List<String> newTranslations) {
        newTranslations.stream().filter(e -> !translations.contains(e)).forEach(e -> translations.add(e));
//        for (String newTranslation : newTranslations) {
//            if (!translations.contains(newTranslation)) {
//                translations.add(newTranslation);
//            }
//        }
    }

    public String getWord() {
        return word;
    }

    public List<String> getTranslations() {
        return translations;
    }
}
