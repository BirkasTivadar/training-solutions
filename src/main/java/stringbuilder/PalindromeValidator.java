package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Text must not be null!");
        }
        word = word.trim();
        StringBuilder reverseWord = new StringBuilder();
        reverseWord.append(word).reverse();
        return word.equalsIgnoreCase(reverseWord.toString());
    }
}
