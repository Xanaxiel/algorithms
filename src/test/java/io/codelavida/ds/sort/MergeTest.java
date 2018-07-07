package io.codelavida.ds.sort;

import org.junit.Test;

import static io.codelavida.ds.DSUtil.getRandomArray;
import static io.codelavida.ds.DSUtil.isSorted;
import static io.codelavida.ds.sort.Merge.sort;
import static org.junit.Assert.*;

public class MergeTest {

    @Test
    public void testMergeSortInts() {
        int[] data = getRandomArray(50);
        sort(data);
        assertTrue(isSorted(data));
    }

}