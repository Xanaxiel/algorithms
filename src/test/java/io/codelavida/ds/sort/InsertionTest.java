package io.codelavida.ds.sort;

import org.junit.Test;

import static io.codelavida.ds.DSUtil.getRandomArray;
import static io.codelavida.ds.DSUtil.isSorted;
import static io.codelavida.ds.sort.Insertion.sort;
import static org.junit.Assert.*;

public class InsertionTest {

    @Test
    public void testInsertionSortInts() {
        int[] data = getRandomArray(50);
        sort(data);
        assertTrue(isSorted(data));
    }

    @Test
    public void testInsertionSortStrings() {
        String[] animals = new String[]{"Zebra", "Cat", "Tiger", "Elephant", "Lion", "Dog"};
        sort(animals);
        assertTrue(isSorted(animals));
    }


}