package io.codelavida.puzzle;

import org.junit.Test;

import static io.codelavida.puzzle.SubsetSum.*;
import static org.junit.Assert.*;

public class SubsetSumTest {

    @Test
    public void testSplitArray() {
        assertTrue(splitArraySameAverage(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertFalse(splitArraySameAverage(new int[]{3, 1}));
        assertTrue(splitArraySameAverage(new int[]{18, 10, 5, 3}));
    }

    @Test
    public void testIsSubsetSum() {
        int[] arr = {3, 34, 4, 12, 5, 2};
        assertTrue(isSubsetSum(arr, 6, 17));
    }

}