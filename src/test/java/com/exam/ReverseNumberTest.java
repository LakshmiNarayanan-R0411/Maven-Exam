package com.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseNumberTest {
    @Test
    public void testReverse() {
        ReverseNumber r = new ReverseNumber();
        assertEquals(321, r.reverse(123));
        assertEquals(1, r.reverse(100));
        assertEquals(0, r.reverse(0));
    }
}
