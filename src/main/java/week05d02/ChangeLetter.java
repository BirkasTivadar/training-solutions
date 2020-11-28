package week05d02;

public class ChangeLetter {
    private final char[] vowelsArray = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public String chargeVowels(String text) {

        for (char vowel : vowelsArray) {
            String strVowel = String.valueOf(vowel);
            if (text.contains(strVowel)) {
                text = text.replace(strVowel, "*");
            }
        }
        return text;
    }

}
