package io.codelavida.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilsTest {

    @Test
    public void testMax() throws IllegalAccessException {
        assertEquals(91, ArrayUtils.max(new int[]{12, 10, 4, 7, 91}));
    }

}