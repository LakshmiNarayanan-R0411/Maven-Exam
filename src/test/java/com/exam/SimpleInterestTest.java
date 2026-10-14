package com.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleInterestTest {
    @Test
    public void testInterest() {
        SimpleInterest s = new SimpleInterest();
        assertEquals(100.0, s.calculate(1000, 5, 2), 0.001);
        assertEquals(0.0, s.calculate(0, 5, 2), 0.001);
    }
}
