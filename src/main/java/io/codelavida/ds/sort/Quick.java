package io.codelavida.ds.sort;

import static io.codelavida.ds.DSUtil.exchange;

public class Quick {


    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (high <= low) return;
        int j = partition(arr, low, high);
        sort(arr, low, j - 1);
        sort(arr, j + 1, high);
    }

    // Partition into arr[low..i-1], arr[i], arr[i+1..high].
    private static int partition(int[] arr, int low, int high) {
        int i = low, j = high + 1;
        int v = arr[low];
        while (true) {
            while (arr[++i] < v) {
                if (i == high) break;
            }
            while (arr[--j] > v) {
                if (j == low) break;
            }
            if (i >= j) break;
            exchange(arr, i, j);
        }
        exchange(arr, low, j);
        return j;
    }
}
