package com.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayMaxTest {
    @Test
    public void testMax() {
        ArrayMax a = new ArrayMax();
        assertEquals(9, a.max(new int[]{3, 9, 2, 7}));
        assertEquals(-1, a.max(new int[]{-5, -1, -9}));
        assertEquals(4, a.max(new int[]{4}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmpty() {
        new ArrayMax().max(new int[]{});
    }
}
