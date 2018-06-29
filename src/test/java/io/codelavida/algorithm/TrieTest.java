package io.codelavida.algorithm;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TrieTest {

    @Test
    public void testTrieCreation() {
        Trie trie = new Trie();
        assertEquals(0, trie.size());
    }


    @Test
    public void testTrieInsertKeys() {
        Trie trie = new Trie();
        trie.insert("Apple");
        assertEquals(1, trie.size());
        assertTrue(trie.contains("Apple"));
    }


    @Test
    public void testTrieLongestPrefix() {
        Trie trie = new Trie();
        trie.insert("She");
        assertEquals("She", trie.longestPrefixOf("Shell"));
    }

    @Test
    public void testTrieKeys() {
        Trie trie = new Trie();
        trie.insertAll(new String[]{
                "Apple", "Amazon", "Google",
                "Facebook", "Netflix", "Microsoft"
        });
        List<String> keys = trie.keys();
        assertEquals(6, keys.size());
    }

    @Test
    public void testTrieKeysWithPrefix() {
        Trie trie = new Trie();
        trie.insert("Rest");
        trie.insert("Tester");
        trie.insert("Testable");
        List<String> keys = trie.keysWithPrefix("Test");
        assertEquals(2, keys.size());
    }
}
