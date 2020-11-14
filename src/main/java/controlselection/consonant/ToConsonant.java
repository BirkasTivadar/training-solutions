package controlselection.consonant;

public class ToConsonant {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static final String VOWELS = "aeiou";

    public char convertToConsonant(char c) {
        if (VOWELS.indexOf(c) >= 0) {
            return ALPHABET.charAt(ALPHABET.indexOf(c) + 1);
        } else {
            return c;
        }
    }
}