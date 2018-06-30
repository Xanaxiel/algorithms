package io.codelavida.algorithm.sort;

import org.junit.Test;

import static io.codelavida.Util.getRandomArray;
import static io.codelavida.Util.isSorted;
import static io.codelavida.algorithm.sort.Merge.sort;
import static org.junit.Assert.*;

public class MergeTest {

    @Test
    public void testMergeSortInts() {
        int[] data = getRandomArray(50);
        sort(data);
        assertTrue(isSorted(data));
    }

}