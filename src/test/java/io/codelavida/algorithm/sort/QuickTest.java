package io.codelavida.algorithm.sort;

import org.junit.Test;

import static io.codelavida.Util.getRandomArray;
import static io.codelavida.Util.isSorted;
import static io.codelavida.algorithm.sort.Quick.sort;
import static org.junit.Assert.*;

public class QuickTest {

    @Test
    public void testQuickSortInts() {
        int[] data = getRandomArray(50);
        sort(data);
        assertTrue(isSorted(data));
    }

}