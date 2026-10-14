package com.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeStringTest {
    @Test
    public void testPalindrome() {
        PalindromeString p = new PalindromeString();
        assertTrue(p.isPalindrome("madam"));
        assertTrue(p.isPalindrome("Level"));
        assertTrue(p.isPalindrome(""));
    }

    @Test
    public void testNotPalindrome() {
        PalindromeString p = new PalindromeString();
        assertFalse(p.isPalindrome("hello"));
    }
}
