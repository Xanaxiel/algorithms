package io.codelavida.ds.search;

import org.junit.Test;

import static io.codelavida.ds.DSUtil.getRandomArray;
import static io.codelavida.ds.search.Binary.search;
import static io.codelavida.ds.sort.Insertion.sort;
import static org.junit.Assert.*;

public class BinaryTest {

    @Test
    public void testBinarySearch() {
        int[] data = getRandomArray(50);
        sort(data);
        assertEquals(34, search(data, data[34]));
        assertEquals(13, search(data, data[13]));
        assertEquals(-1, search(data, 120));
    }

}