package io.codelavida.ds;

import io.codelavida.ds.list.ArrayList;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ArrayListTest {

    @Test
    public void testCreateEmptyList() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, list.size());
    }

    @Test
    public void testAddElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        assertEquals(1, list.size());
        assertEquals(Integer.valueOf(10), list.get(0));
    }

    @Test
    public void testSetElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        assertEquals(Integer.valueOf(10), list.set(0, 20));
        assertEquals(Integer.valueOf(20), list.get(0));
    }

    @Test
    public void testRemoveElement(){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.remove(0);
        assertEquals(0, list.size());
    }

}