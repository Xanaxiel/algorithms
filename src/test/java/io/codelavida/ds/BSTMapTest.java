package io.codelavida.ds;

import org.junit.Test;

import static org.junit.Assert.*;

public class BSTMapTest {


    @Test
    public void testBstSize() {
        BSTMap<String, String> BSTMap = new BSTMap<>();
        assertEquals(0, BSTMap.size());
        BSTMap.put("Fruit", "Apple");
        assertEquals(1, BSTMap.size());
    }


    @Test
    public void testBstSearch() {
        BSTMap<String, String> BSTMap = new BSTMap<>();
        BSTMap.put("Fruit", "Apple");
        BSTMap.put("Drink", "Juice");
        BSTMap.put("Desert", "Cake");
        assertEquals("Juice", BSTMap.get("Drink"));
    }

}