package io.codelavida.ds;

/**
 * Represents an entry with a key of type K and value of type V. The entry
 * can be added to data structures that store key-value pairs.
 *
 * Keys K must be Comparable.
 *
 * @param <K> type parameter for the key object
 * @param <V> type parameter for the value object
 */
public interface Entry<K, V> {
    K getKey();

    V getValue();
}
