package com.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void testReverse() {
        ReverseString r = new ReverseString();
        assertEquals("olleh", r.reverse("hello"));
        assertEquals("", r.reverse(""));
        assertEquals("a", r.reverse("a"));
    }
}
