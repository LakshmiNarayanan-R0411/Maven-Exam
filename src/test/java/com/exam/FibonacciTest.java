package com.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {
    @Test
    public void testSeries() {
        Fibonacci f = new Fibonacci();
        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 5, 8}, f.series(7));
        assertArrayEquals(new int[]{}, f.series(0));
        assertArrayEquals(new int[]{0}, f.series(1));
    }
}
