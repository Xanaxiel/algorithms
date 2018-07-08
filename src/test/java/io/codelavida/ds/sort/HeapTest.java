package io.codelavida.ds.sort;

import org.junit.Test;

import static io.codelavida.ds.ArrayUtil.getRandomArray;
import static io.codelavida.ds.ArrayUtil.isSorted;
import static io.codelavida.ds.sort.Heap.sort;
import static org.junit.Assert.*;

public class HeapTest {

    @Test
    public void testHeapSortInts() {
        int[] data = getRandomArray(100);
        sort(data);
        assertTrue(isSorted(data));
    }

}