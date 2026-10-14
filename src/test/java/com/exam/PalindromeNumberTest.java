package com.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeNumberTest {
    @Test
    public void testPalindrome() {
        PalindromeNumber p = new PalindromeNumber();
        assertTrue(p.isPalindrome(121));
        assertTrue(p.isPalindrome(7));
    }

    @Test
    public void testNotPalindrome() {
        PalindromeNumber p = new PalindromeNumber();
        assertFalse(p.isPalindrome(123));
    }
}
