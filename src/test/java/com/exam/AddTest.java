package com.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class AddTest {
    @Test
    public void testAdd() {
        Add c = new Add();
        assertEquals(5, c.add(2, 3));
        assertEquals(0, c.add(0, 0));
        assertEquals(-1, c.add(2, -3));
    }
}
