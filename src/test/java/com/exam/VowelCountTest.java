package com.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class VowelCountTest {
    @Test
    public void testCount() {
        VowelCount v = new VowelCount();
        assertEquals(2, v.count("hello"));
        assertEquals(5, v.count("AEIOU"));
        assertEquals(0, v.count("xyz"));
        assertEquals(0, v.count(""));
    }
}
