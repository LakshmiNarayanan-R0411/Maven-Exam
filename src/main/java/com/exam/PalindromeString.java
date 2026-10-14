package com.exam;

public class PalindromeString {
    public boolean isPalindrome(String s) {
        String clean = s.toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }
}
