package io.codelavida;

import org.junit.Test;

import static io.codelavida.Util.isSorted;
import static io.codelavida.Util.max;
import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void testMax() throws IllegalAccessException {
        assertEquals(91, max(new int[]{12, 10, 4, 7, 91}));
    }

    @Test
    public void testIsSorted() {
        assertTrue(isSorted(new int[]{2, 4, 10, 45, 91}));
        assertFalse(isSorted(new int[]{12, 10, 4, 7, 91}));
    }


}