package week05d02;

public class ChangeLetter {
    final char[] vowelsArray = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public String chargeVowels(String text) {

        for (char vowel : vowelsArray) {
            if (text.contains(String.valueOf(vowel))) {
                text = text.replace(String.valueOf(vowel), "*");
            }
        }
        return text;


    }

}
