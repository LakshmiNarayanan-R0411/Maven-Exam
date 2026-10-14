package com.exam;

public class PalindromeNumber {
    public boolean isPalindrome(int n) {
        int original = n, rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return original == rev;
    }
}
