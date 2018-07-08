package io.codelavida.ds;

import io.codelavida.ds.map.BSTreeMap;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSTreeMapTest {


    @Test
    public void testBstSize() {
        BSTreeMap<String, String> bsTreeMap = new BSTreeMap<>();
        assertEquals(0, bsTreeMap.size());
        bsTreeMap.put("Fruit", "Apple");
        assertEquals(1, bsTreeMap.size());
    }


    @Test
    public void testBstSearch() {
        BSTreeMap<String, String> bsTreeMap = new BSTreeMap<>();
        bsTreeMap.put("Fruit", "Apple");
        bsTreeMap.put("Drink", "Juice");
        bsTreeMap.put("Desert", "Cake");
        assertEquals("Juice", bsTreeMap.get("Drink"));
    }

}