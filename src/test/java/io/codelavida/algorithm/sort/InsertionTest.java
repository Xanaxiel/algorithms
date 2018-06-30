package io.codelavida.algorithm.sort;

import org.junit.Test;

import static io.codelavida.Util.getRandomArray;
import static io.codelavida.Util.isSorted;
import static io.codelavida.algorithm.sort.Insertion.sort;
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