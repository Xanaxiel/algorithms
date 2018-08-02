package io.codelavida.ds;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayListTest {

    @Test
    public void sizeOfEmptyListMustBeZero() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, list.size());
    }

    @Test
    public void elementShouldBeAddedAtEnd() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        assertEquals(1, list.size());
        assertEquals(Integer.valueOf(10), list.get(0));
    }

    @Test
    public void elementsShouldBeAddedAtEnd() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);

        list2.addAll(list1);

        assertEquals(3, list2.size());
    }

    @Test
    public void elementShouldBeAddedByPosition() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        assertEquals(1, list.size());
        assertEquals(Integer.valueOf(10), list.get(0));
    }

    @Test
    public void elementShouldReplace() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        assertEquals(Integer.valueOf(10), list.set(0, 20));
        assertEquals(Integer.valueOf(20), list.get(0));
    }

    @Test
    public void elementShouldBeRemovedByPosition() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals(Integer.valueOf(20), list.remove(1));
        assertEquals(2, list.size());
    }

    @Test
    public void elementShouldBeRemovedByValue() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        assertTrue(list.remove(Integer.valueOf(30)));
        assertEquals(1, list.size());
        assertFalse(list.remove(Integer.valueOf(20)));
        assertEquals(1, list.size());
    }

    @Test
    public void containmentOfElementInList() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        assertTrue(list.contains(20));
        assertFalse(list.contains(30));
    }

    @Test
    public void containmentOfElementsInList() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        List<Integer> subList = new ArrayList<>();
        subList.add(20);
        subList.add(30);
        assertTrue(list.containsAll(subList));
    }

}