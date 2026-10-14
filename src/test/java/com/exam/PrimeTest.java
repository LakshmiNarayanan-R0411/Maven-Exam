package com.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeTest {
    @Test
    public void testPrime() {
        Prime p = new Prime();
        assertTrue(p.isPrime(2));
        assertTrue(p.isPrime(13));
    }

    @Test
    public void testNotPrime() {
        Prime p = new Prime();
        assertFalse(p.isPrime(0));
        assertFalse(p.isPrime(1));
        assertFalse(p.isPrime(9));
    }
}
