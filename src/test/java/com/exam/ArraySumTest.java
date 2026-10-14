package com.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArraySumTest {
    @Test
    public void testSum() {
        ArraySum a = new ArraySum();
        assertEquals(15, a.sum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, a.sum(new int[]{}));
        assertEquals(-3, a.sum(new int[]{-1, -2}));
    }
}
