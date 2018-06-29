package io.codelavida.algorithm;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 *  Implementation of a trie data structure.
 *  Trie is also called a prefix tree is a type of N-ary tree.
 *  Tries are used typically to store strings, each node in
 *  a trie represents a prefix of a string.
 *
 *  Each node can be represented with an array of characters
 *  or as a map. The former is faster but is a terrible
 *  waste of space. The latter is a bit slower but is more
 *  efficient in space and flexible in terms that it is not
 *  restricted in terms of size of the children.
 *
 */
public class Trie {

    private class Node {
        Map<Character, Node> children = new HashMap<>();
    }

    private Node root;

    public Trie() {
        this.root = new Node();
    }

    public void insert(final String s) {
        Node cur = root;
        for (char c : s.toCharArray()) {
            if (!cur.children.containsKey(c)) {
                cur.children.put(c, new Node());
            }
            cur = cur.children.get(c);
        }
    }

    public boolean contains(final String key) {
        Node cur = root;
        for (char c : key.toCharArray()) {
            Node next = cur.children.get(c);
            if (next == null) {
                return false;
            } else {
                cur = next;
            }
        }
        return keysWithPrefix(key).size()==1;
    }

    /**
     * takes a string as argument and returns the longest
     * key in the symbol table that is a prefix of that string.
     *
     * @param s input string
     * @return longest prefix of s in the trie, can be empty
     */
    public String longestPrefixOf(final String s) {
        Node cur = root;
        StringBuilder prefix = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (cur.children.get(c) != null) {
                cur = cur.children.get(c);
                prefix.append(c);
            }
        }
        return prefix.toString();
    }

    private void collect(Node x, String pre, List<String> q) {
        // base case - node has no children (leaf node)
        if (x.children.size() == 0) {
            q.add(pre);
            return;
        }
        for (char c : x.children.keySet()) {
            collect(x.children.get(c), pre + c, q);
        }
    }

    /**
     * takes a string as argument and returns all the keys
     * in the symbol table having that string as prefix.
     *
     * @param pre input string as prefix
     * @return list of strings that have prefix pre
     */
    public List<String> keysWithPrefix(final String pre) {
        List<String> q = new LinkedList<>();
        Node cur = root;
        for (char c : pre.toCharArray()) {
            if (cur.children.get(c) != null) {
                cur = cur.children.get(c);
            } else {
                return q;
            }
        }
        collect(cur, pre, q);
        return q;
    }

    /**
     * @return returns all keys in the trie.
     */
    public List<String> keys() {
        return keysWithPrefix("");
    }

    /**
     * @return size of the trie, that is number of keys
     */
    public int size() {
        return root.children.size();
    }

}
