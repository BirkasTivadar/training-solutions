package stringbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeValidatorTest {
    @Test
    void nullParameterShouldThrowException(){
        PalindromeValidator palindromeValidator = new PalindromeValidator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> palindromeValidator.isPalindrome(null));
        assertEquals("Text must not be null!", iae.getMessage());


    }

    @Test
    void isPalindrome() {
        PalindromeValidator palindromeValidator = new PalindromeValidator();
        assertEquals(true, palindromeValidator.isPalindrome("Racecar"));
        assertEquals(false, palindromeValidator.isPalindrome("start"));
        assertEquals(true, palindromeValidator.isPalindrome(""));
        assertEquals(true, palindromeValidator.isPalindrome("\n\t"));
    }
}