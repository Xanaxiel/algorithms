package io.codelavida.algorithm.sort;

import org.junit.Test;

import static io.codelavida.Util.getRandomArray;
import static io.codelavida.Util.isSorted;
import static io.codelavida.algorithm.sort.Heap.sort;
import static org.junit.Assert.*;

public class HeapTest {

    @Test
    public void testHeapSortInts() {
        int[] data = getRandomArray(100);
        sort(data);
        assertTrue(isSorted(data));
    }

}