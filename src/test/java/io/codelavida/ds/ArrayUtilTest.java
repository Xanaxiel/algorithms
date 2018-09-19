package io.codelavida.ds;

import org.junit.Test;

import java.util.Arrays;

import static io.codelavida.ds.ArrayUtil.*;
import static org.junit.Assert.*;

public class ArrayUtilTest {

    @Test
    public void testSum() {
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
        assertEquals(17.0, median(new int[]{17, 5, 2, 21, 32}), 0.001);
        assertEquals(19.5, median(new int[]{17, 5, 2, 43, 32, 22}), 0.001);
    }

    @Test
    public void testMedianPart() {
        assertEquals(32.0, median(new int[]{2, 5, 17, 22, 32, 43, 78, 97}, 2, 5), 0.001);
        assertEquals(27.0, median(new int[]{2, 5, 17, 22, 32, 43, 78, 97}, 2, 4), 0.001);
    }

    @Test
    public void testBinarySearch() {
        int[] data = {10, 12, 17, 23, 28, 34};
        assertEquals(3, binarySearch(data, 23));
        assertEquals(-1, binarySearch(data, 120));
    }

    @Test
    public void testHeapSortInts() {
        int[] data = getRandomArray(100);
        heapSort(data);
        assertTrue(isSorted(data));
    }

    @Test
    public void testInsertionSortInts() {
        int[] data = getRandomArray(50);
        insertonSort(data);
        assertTrue(isSorted(data));
    }

    @Test
    public void testInsertionSortStrings() {
        String[] animals = new String[]{"Zebra", "Cat", "Tiger", "Elephant", "Lion", "Dog"};
        insertonSort(animals);
        assertTrue(isSorted(animals));
    }

    @Test
    public void testMergeSortInts() {
        int[] data = getRandomArray(50);
        mergeSort(data);
        System.out.println(Arrays.toString(data));
        assertTrue(isSorted(data));
    }

    @Test
    public void testQuickSortInts() {
        int[] data = getRandomArray(50);
        quickSort(data);
        assertTrue(isSorted(data));
    }

    @Test
    public void testSelectionSortInts() {
        int[] data = getRandomArray(50);
        selectionSort(data);
        assertTrue(isSorted(data));
    }

    @Test
    public void testSelectionSortStrings() {
        String[] animals = new String[]{"Zebra", "Cat", "Tiger", "Elephant", "Lion", "Dog"};
        selectionSort(animals);
        assertTrue(isSorted(animals));
    }

    @Test
    public void testKthLargestElement() {
        int[] data = {10, 34, 2, 5, 76, 19, 48};
        assertEquals(19, ArrayUtil.quickSelect(data, 4));
    }

    @Test
    public void testSquareMatrix() {
        int[][] mat = {
                {2, 3, 4},
                {3, 5, 6},
                {8, 5, 7}
        };
        assertTrue(ArrayUtil.isSquareMatrix(mat));
    }

}