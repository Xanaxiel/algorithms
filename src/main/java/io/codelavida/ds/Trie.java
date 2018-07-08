package io.codelavida.ds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 * Implementation of a trie data structure. Trie is also called a prefix tree
 * is a type of N-ary tree. Tries are used typically to store strings, each
 * node in a trie represents a prefix of a string.
 * <p>
 * Each node can be represented with an array of characters or as a map. The
 * former is faster but is a terrible waste of space. The latter is a bit
 * slower but is more efficient in space and flexible in terms that it is not
 * restricted in terms of size of the children.
 * <p>
 * For more information see <a href="https://en.wikipedia.org/Trie">Tries</a>
 */
public class Trie {

    private int size = 0;

    private class Node {
        Map<Character, Node> children = new HashMap<>();
        boolean isKey = false;
    }

    private Node root;

    public Trie() {
        this.root = new Node();
    }

    public void insert(final String key) {
        Node cur = root;
        for (char c : key.toCharArray()) {
            if (!cur.children.containsKey(c)) {
                cur.children.put(c, new Node());
            }
            cur = cur.children.get(c);
        }
        cur.isKey = true;
        this.size++;
    }

    public void insertAll(String[] keys) {
        for (String k : keys) {
            insert(k);
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
        return cur.isKey;
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
        if (x.isKey) {
            q.add(pre);
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
        return this.size;
    }


    /*
     * A command line auto suggester application using the
     * trie data structure. Takes a prefix as input and
     * prints the top 10 suggestions.
     */
    public static void main(String[] args) {
        Trie dictionary = new Trie();
        File en_words = new File(Objects.requireNonNull(Trie.class.getClassLoader().getResource("en_words_1k.txt")).getFile());
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(en_words)));
            br.lines().forEach(dictionary::insert);
            System.out.println("Type some letter and hit enter to see suggestions");
            System.out.println("Type /exit to exit the program.");
            String input;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("/exit")) {
                    System.out.println("Goodbye.");
                    break;
                }
                List<String> suggestions = dictionary.keysWithPrefix(input);
                if (suggestions.size() > 0) {
                    suggestions.stream().limit(10).forEach(System.out::println);
                } else {
                    System.out.println("No suggestion.");
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
