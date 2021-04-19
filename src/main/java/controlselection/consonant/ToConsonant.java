package controlselection.consonant;

public class ToConsonant {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static final String VOWELS = "aeiou";

    public char convertToConsonant(char c) {
        return VOWELS.contains(String.valueOf(c)) ? ALPHABET.charAt(ALPHABET.indexOf(c) + 1) : c;
    }
}