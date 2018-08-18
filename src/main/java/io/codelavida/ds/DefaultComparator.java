package io.codelavida.ds;

import java.util.Comparator;

public class DefaultComparator<K> implements Comparator<K> {

    @SuppressWarnings("unchecked")
    @Override
    public int compare(K k1, K k2) {
        return ((Comparable<K>) k1).compareTo(k2);
    }
}
