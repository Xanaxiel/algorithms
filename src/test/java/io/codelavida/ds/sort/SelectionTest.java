package io.codelavida.ds.sort;

import org.junit.Test;

import static io.codelavida.ds.DSUtil.getRandomArray;
import static io.codelavida.ds.DSUtil.isSorted;
import static io.codelavida.ds.sort.Selection.sort;
import static org.junit.Assert.*;

public class SelectionTest {

    @Test
    public void testSelectionSortInts() {
        int[] data = getRandomArray(50);
        sort(data);
        assertTrue(isSorted(data));
    }

    @Test
    public void testSelectionSortStrings() {
        String[] animals = new String[]{"Zebra", "Cat", "Tiger", "Elephant", "Lion", "Dog"};
        sort(animals);
        assertTrue(isSorted(animals));
    }
}