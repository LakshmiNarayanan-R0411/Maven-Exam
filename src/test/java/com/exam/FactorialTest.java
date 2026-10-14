package com.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void testFactorial() {
        Factorial f = new Factorial();
        assertEquals(1, f.factorial(0));
        assertEquals(1, f.factorial(1));
        assertEquals(120, f.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegative() {
        new Factorial().factorial(-1);
    }
}
