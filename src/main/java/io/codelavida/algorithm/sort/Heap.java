package io.codelavida.algorithm.sort;

import static io.codelavida.Util.exchange;

public class Heap {


    public static void sort(int[] arr) {
        int n = arr.length;
        buildHeap(arr, n);
        for (int i = n - 1; i >= 0; i--) {
            exchange(arr, 0, i);
            heapify(arr, 0, i);
        }
    }

    private static void buildHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }

    private static void heapify(int[] arr, int idx, int max) {
        int largest = idx;
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        // If left child is larger than the root
        if (left < max && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than the root
        if (right < max && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != idx) {
            exchange(arr, idx, largest);
            heapify(arr, largest, max);
        }
    }

}
