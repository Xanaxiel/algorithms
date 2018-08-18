package io.codelavida.ds;

public class MinHeapPQ<K, V> extends AbstractPriorityQueue<K, V> {

    @SuppressWarnings("unchecked")
    private ArrayList<Entry<K, V>> heap = new ArrayList<>();


    @Override
    public int size() {
        return heap.size();
    }

    private int parent(int j) {
        return (j - 1) / 2;
    }

    private int left(int j) {
        return 2 * j + 1;
    }

    private int right(int j) {
        return 2 * j + 2;
    }

    private boolean hasLeft(int j) {
        return left(j) < size();
    }

    private boolean hasRight(int j) {
        return right(j) < size();
    }

    private void swap(int i, int j) {
        Entry<K, V> temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    /**
     * Move the element at index i up restoring the heap property.
     *
     * @param j the index to be moved up
     */
    private void upHeap(int j) {
        while (j > 0) {
            int p = parent(j);
            if (compare(heap.get(p), heap.get(j)) <= 0) {
                break;
            }
            swap(p, j);
            j = p;
        }
    }

    private void downHeap(int j) {
        while (hasLeft(j)) {
            int left = left(j);
            int small = left;
            if (hasRight(j)) {
                int right = right(j);
                if (compare(heap.get(left), heap.get(right)) > 0) {
                    small = right;
                }
            }
            if (compare(heap.get(j), heap.get(small)) >= 0) {
                break;
            }
            swap(j, small);
            j = small;
        }
    }

    @Override
    public Entry<K, V> insert(K key, V value) {
        Entry<K, V> entry = new PQEntry<>(key, value);
        heap.add(entry);
        upHeap(size() - 1);
        return entry;
    }

    @Override
    public Entry<K, V> min() {
        if (heap.isEmpty()) return null;
        return heap.get(0);
    }

    @Override
    public Entry<K, V> removeMin() {
        if (heap.isEmpty()) return null;
        Entry<K, V> min = heap.get(0);
        int last = size() - 1;
        swap(0, last);
        heap.remove(last);
        downHeap(0);
        return min;
    }

    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
