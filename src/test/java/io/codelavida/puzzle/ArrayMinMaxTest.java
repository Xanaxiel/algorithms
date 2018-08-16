package io.codelavida.puzzle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayMinMaxTest {

    @Test(expected = IllegalArgumentException.class)
    public void testMinMaxForInvalidInput() {
        ArrayMinMax.findMinMax(null);
    }

    @Test
    public void testMinMaxValidInput() {
        int[] arr = {-10, 9, 0, 3, 98, 7, 5};

        ArrayMinMax.MinMax minMax = ArrayMinMax.findMinMax(arr);
        assertEquals(-10, minMax.getMin());
        assertEquals(98, minMax.getMax());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinMaxDCForInvalidInput() {
        ArrayMinMax.findMinMaxDC(null);
    }

    @Test
    public void testMinMaxDCValidInput() {
        int[] arr = {-10, 9, 0, 3, 98, 7, 5};

        ArrayMinMax.MinMax minMax = ArrayMinMax.findMinMaxDC(arr);
        assertEquals(-10, minMax.getMin());
        assertEquals(98, minMax.getMax());
    }


}