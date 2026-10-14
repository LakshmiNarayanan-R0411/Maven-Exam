package com.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class LargestTest {
    @Test
    public void testLargest() {
        Largest l = new Largest();
        assertEquals(9, l.largest(3, 9, 5));
        assertEquals(9, l.largest(9, 3, 5));
        assertEquals(9, l.largest(3, 5, 9));
        assertEquals(5, l.largest(5, 5, 5));
    }
}
