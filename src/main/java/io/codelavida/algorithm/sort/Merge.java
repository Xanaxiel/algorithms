package io.codelavida.algorithm.sort;

public class Merge {

    private static void merge(int[] arr, int low, int mid, int high) {
        int i = low, j = mid + 1;

        int[] temp = new int[arr.length];

        for (int k = low; k <= high; k++) {
            temp[k] = arr[k];
        }

        for (int k = low; k <= high; k++) {
            if (i > mid)                // left half exhausted
                arr[k] = temp[j++];
            else if (j > high)          // right half exhausted
                arr[k] = temp[i++];
            else if (temp[j] < temp[i]) // current key on right less than current key in left
                arr[k] = temp[j++];
            else                        // current key on left less than current key in right
                arr[k] = temp[i++];
        }
    }

    private static void sort(int[] arr, int low, int high) {
        if (high <= low) return;
        int mid = low + (high - low) / 2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }
}
