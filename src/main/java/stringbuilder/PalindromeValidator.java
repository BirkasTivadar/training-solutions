package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Text must not be null!");
        }
        String wordLowerCase = word.trim().toLowerCase();
        StringBuilder wordReverse = new StringBuilder(wordLowerCase).reverse();
        return wordLowerCase.equals(wordReverse.toString());
    }
}
