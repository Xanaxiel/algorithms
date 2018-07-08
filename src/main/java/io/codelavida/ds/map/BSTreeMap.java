package io.codelavida.ds.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * A binary search tree map implementation.
 *
 * @param <K> type of key in the map, must be comparable
 * @param <V> type of value in the map
 */
public class BSTreeMap<K extends Comparable<K>, V> implements Map<K, V> {

    private Node root;

    private class Node {
        private K key;
        private V value;
        private Node left;
        private Node right;
        private int N; // size of the subtree of this node

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size() {
        return size(root);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    private int size(Node node) {
        return node == null ? 0 : node.N;
    }

    public V put(K key, V value) {
        root = put(root, key, value);
        return value;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    private Node put(Node node, K key, V value) {
        if (node == null) {
            node = new Node(key, value);
        } else if (key.compareTo(node.key) < 0) {
            node.left = put(node.left, key, value);
        } else if (key.compareTo(node.key) > 0) {
            node.right = put(node.right, key, value);
        }
        node.N = size(node.left) + size(node.right) + 1;
        return node;
    }

    public V get(K key) {
        return get(root, key);
    }

    private V get(Node node, K key) {
        if (node == null) {
            return null;
        } else if (key == node.key) {
            return node.value;
        } else if (key.compareTo(node.key) < 0) {
            return get(node.left, key);
        } else {
            return get(node.right, key);
        }
    }

    public void delete(K key) {
        root = delete(root, key);
    }

    private Node delete(Node node, K key) {
        if (node == null) {
            return null;
        }
        if (key == node.key) {
            if (node.right == null)
                return node.left;
            if (node.left == null)
                return node.right;
            Node t = node;
            node = min(node.right);
            node.right = delMin(node.right);
            node.left = t.left;
        } else if (key.compareTo(node.key) < 0) {
            node.left = delete(node.left, key);
        } else {
            node.right = delete(node.right, key);
        }
        return node;
    }

    private void delMin() {
        root = delMin(root);
    }

    private Node delMin(Node node) {
        if (node.left == null) return node.right;
        node.left = delMin(node.left);
        node.N = size(node.left) + size(node.right) + 1;
        return node;
    }

    public K min() {
        return min(root).key;
    }

    private Node min(Node node) {
        if (node.left == null) return node;
        else return min(node.left);
    }
}
