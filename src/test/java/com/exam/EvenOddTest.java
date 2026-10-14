package com.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class EvenOddTest {
    @Test
    public void testEven() {
        EvenOdd e = new EvenOdd();
        assertTrue(e.isEven(4));
        assertTrue(e.isEven(0));
    }

    @Test
    public void testOdd() {
        EvenOdd e = new EvenOdd();
        assertFalse(e.isEven(7));
        assertFalse(e.isEven(-3));
    }
}
