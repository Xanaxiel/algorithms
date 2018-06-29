package io.codelavida.algorithm;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;
import static io.codelavida.algorithm.ArrayUtils.*;

public class ArrayUtilsTest {

    private Random generator = new java.util.Random();

    private int[] getRandomArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = generator.nextInt(100);
        }
        return arr;
    }

    @Test
    public void testMax() throws IllegalAccessException {
        assertEquals(91, max(new int[]{12, 10, 4, 7, 91}));
    }

    @Test
    public void testIsSorted() {
        assertTrue(isSorted(new int[]{2, 4, 10, 45, 91}));
        assertFalse(isSorted(new int[]{12, 10, 4, 7, 91}));
    }

    @Test
    public void testInsertionSort() {
        int[] data = getRandomArray(10);
        insertionSort(data);
        assertTrue(isSorted(data));
    }

    @Test
    public void testBinarySearch() {
        int[] data = new int[]{4, 7, 20, 25, 34, 45, 100};
        assertEquals(2, binarySearch(data, 20));
        assertEquals(3, binarySearch(data, 25));
        assertEquals(-1, binarySearch(data, 200));
        assertEquals(-1, binarySearch(data, 2));
    }
}
