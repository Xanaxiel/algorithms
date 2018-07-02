package io.codelavida;

import org.junit.Test;

import static io.codelavida.Util.*;
import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void testMax() {
        assertEquals(91, max(new int[]{12, 10, 4, 7, 91}));
        assertEquals(10, max(new int[]{12, 10, 4, 7, 91}, 1, 2));
    }

    @Test
    public void testIsSorted() {
        assertTrue(isSorted(new int[]{2, 4, 10, 45, 91}));
        assertFalse(isSorted(new int[]{12, 10, 4, 7, 91}));
    }

    @Test
    public void testMedianEntire() {
        assertEquals(17.0, median(new int[]{2, 5, 17, 21, 32}), 0.001);
        assertEquals(19.5, median(new int[]{2, 5, 17, 22, 32, 43}), 0.001);
    }

    @Test
    public void testMedianPart() {
        assertEquals(32.0, median(new int[]{2, 5, 17, 22, 32, 43, 78, 97}, 2, 5), 0.001);
        assertEquals(27.0, median(new int[]{2, 5, 17, 22, 32, 43, 78, 97}, 2, 4), 0.001);
    }



}