package com.exam;

import org.junit.Test;
import static org.junit.Assert.*;

public class GradeTest {
    @Test
    public void testGrades() {
        Grade g = new Grade();
        assertEquals("A", g.grade(95));
        assertEquals("B", g.grade(80));
        assertEquals("C", g.grade(65));
        assertEquals("D", g.grade(50));
        assertEquals("F", g.grade(30));
    }

    @Test
    public void testBoundaries() {
        Grade g = new Grade();
        assertEquals("A", g.grade(90));
        assertEquals("B", g.grade(75));
        assertEquals("F", g.grade(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalid() {
        new Grade().grade(101);
    }
}
