package io.codelavida.ds;

import org.junit.Test;

import static io.codelavida.ds.ArrayUtil.*;
import static org.junit.Assert.*;

public class ArrayUtilTest {

    @Test
    public void testSum(){
        assertEquals(100, sum(new int[]{12, 10, 4, 7, 67}));
    }


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