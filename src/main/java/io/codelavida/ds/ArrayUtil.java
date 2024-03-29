package io.codelavida.ds;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

/**
 * Collection of utility functions on arrays
 */
public final class ArrayUtil {

    private static Random generator = new java.util.Random();

    private ArrayUtil() {

    }

    /**
     * Checks if an array of integers is sorted in non-decreasing order
     *
     * @param arr input array
     * @return true if the array is sorted or false
     */
    public static boolean isSorted(int[] arr) {
        for (int i = 0, j = 1; i < arr.length - 1; i++, j++) {
            if (arr[i] > arr[j]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if an array of reference types is sorted in non-decreasing order.
     * The class must implement the Comparable interface.
     *
     * @param arr input array of objects
     * @return true if the array is sorted or false
     */
    @SuppressWarnings("unchecked")
    public static boolean isSorted(Comparable[] arr) {
        for (int i = 0, j = 1; i < arr.length - 1; i++, j++) {
            if (arr[i].compareTo(arr[j]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSquareMatrix(int[][] mat) {
        for (int[] vec : mat) {
            if (vec.length != mat.length) {
                return false;
            }
        }
        return true;
    }

    public static void exchange(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void exchange(Comparable[] arr, int i, int j) {
        Comparable t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    /**
     * Given an integer array find the kth largest element. The
     * brute force approach will take O(nlog(n)) time, as we can first
     * sort the algorithm and then return arr[k]. A better algorithm is
     * to use the partition method of the quicksort algorithm and recursively
     * quickselect the first or second half of the partitioned array based
     * on whether the partition index j < or > k.
     *
     * @param arr input array
     * @param k   integer representing the kth largest element
     * @return the kth largest element
     */
    public static int quickSelect(int[] arr, int k) {
        return quickSelect(arr, k - 1, 0, arr.length - 1);
    }

    private static int quickSelect(int[] arr, int k, int low, int high) {
        int r = partition(arr, low, high);
        if (k < r) {
            return quickSelect(arr, k, low, r - 1);
        } else if (k > r) {
            return quickSelect(arr, k, r + 1, high);
        }
        return arr[r];
    }

    public static double median(int[] arr, int begin, int size) {
        int m = begin + (size - 1) / 2;
        // odd
        if (size % 2 == 1) {
            return quickSelect(arr, m + 1);
        } else {
            // even then (arr[n/2 - 1] + arr[n/2])/2.0
            return (quickSelect(arr, m + 1) + quickSelect(arr, m + 2)) / 2.0;
        }
    }


    public static double median(int[] arr) {
        return median(arr, 0, arr.length);
    }


    public static int[] getRandomArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = generator.nextInt(length);
        }
        return arr;
    }

    public static int sum(int[] nums, int low, int high) {
        if (low > high) return 0;            // zero elements in the array
        if (low == high) return nums[low];   // one element in the array
        else {
            int mid = (low + high) / 2;
            return sum(nums, low, mid) + sum(nums, mid + 1, high);
        }
    }

    public static int sum(int[] nums) {
        return sum(nums, 0, nums.length - 1);
    }

    public static double avg(int[] nums) {
        return (sum(nums) * 1.0) / nums.length;
    }

    public static int max(int[] nums, int begin, int size) {
        int end = begin + size;
        int m = Integer.MIN_VALUE;
        for (int i = begin; i < end; i++) {
            if (nums[i] > m) m = nums[i];
        }
        return m;
    }

    /**
     * Finds the largest element in an array of integers.
     *
     * @return index of the largest element in the array
     */
    public static int max(int[] nums) {
        return max(nums, 0, nums.length);
    }

    /**
     * Sorts an array of integers in ascending order using selection sorting
     * algorithm. The algorithm sorts the array by looping through it and in
     * every pass i, it maintains the invariant that the array 0...i-1 is in
     * sorted order.
     *
     * @param arr input array of integers to be sorted.
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    exchange(arr, i, j);
                }
            }
        }
    }

    /**
     * Sorts an array of objects using the selection sorting algorithm. The objects
     * in the array must be comparable (by implementing the Comparable interface).
     *
     * @param arr input array of object to be sorted
     */
    @SuppressWarnings("unchecked")
    public static void selectionSort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[i]) < 0) {
                    exchange(arr, i, j);
                }
            }
        }
    }

    /**
     * Sorts an array of integers in the natural order using the quick sort
     * algorithm. The quick sort algorithm uses a recursive strategy called
     * divide and conquer. See the recursive quick sort method.
     *
     * @param arr input array of integers.
     */
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * This method recursively calls itself to first partition the array in
     * two sub-arrays. The partition method returns the partitioned index j
     * such that
     * arr[i] < arr[j] for all i < j
     * arr[k] > arr[j] for all k > j
     *
     * @param arr  the original array
     * @param low  the lower index of the array to be recursively sorted
     * @param high the higher index of the array to be recursively sorted
     */
    private static void quickSort(int[] arr, int low, int high) {
        if (high <= low) return;
        int j = partition(arr, low, high);
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }

    // Partition into arr[low..i-1], arr[i], arr[i+1..high].
    private static int partition(int[] arr, int low, int high) {
        int i = low, j = high + 1;

        // Choose a pivot element v (first element of the array)
        int v = arr[low];

        while (true) {
            // increment i as long as arr[i] < v and i < high
            while (arr[++i] < v) {
                if (i == high) break;
            }
            // decrement j as long as arr[j] > v and j > low
            while (arr[--j] > v) {
                if (j == low) break;
            }
            if (i >= j) break;
            exchange(arr, i, j);
        }
        exchange(arr, low, j);
        return j;
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int i = low, j = mid + 1;

        int[] temp = new int[arr.length];

        if (high + 1 - low >= 0) {
            System.arraycopy(arr, low, temp, low, high + 1 - low);
        }

        for (int k = low; k <= high; k++) {
            // left half exhausted, copy rest of right half
            if (i > mid) {
                arr[k] = temp[j++];
            }
            // right half exhausted, copy rest of left half
            else if (j > high) {
                arr[k] = temp[i++];
            }
            // current key on right less than current key in left
            else if (temp[j] < temp[i]) {
                arr[k] = temp[j++];
            }
            // current key on left less than current key in right
            else {
                arr[k] = temp[i++];
            }
        }
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (high <= low) return;
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    /**
     * Insertion sort implementation. For visualization, let's say we
     * process the array in left to right order. Starting from the second
     * element compare `it` with all the elements on its left. Every time
     * we find an element j that is greater than `it`, we slide all elements
     * one position to the right starting from j to `it`'s position. Then we
     * slot `it` at the position j.
     *
     * @param arr original array that will be sorted in increasing order.
     */
    public static void insertonSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int cur = arr[i];
            int j = i;
            while (j > 0 && cur < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = cur;
        }
    }

    @SuppressWarnings("unchecked")
    public static void insertonSort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Comparable cur = arr[i];
            int j = i;
            while (j > 0 && cur.compareTo(arr[j - 1]) < 0) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = cur;
        }
    }

    public static void heapSort(int[] arr) {
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

    private static int binarySearch(int[] arr, int elem, int start, int end) {
        if (start > end) return -1;
        int k = (start + end) / 2;
        if (elem == arr[k])
            return k;
        else if (elem > arr[k])
            return binarySearch(arr, elem, k + 1, end);
        else
            return binarySearch(arr, elem, 0, k - 1);
    }

    /**
     * Search if `elem` exists in `arr`
     *
     * @param arr input integer array, assume it's already sorted.
     * @return true if the element exists or false
     */

    public static int binarySearch(int[] arr, int elem) {
        return binarySearch(arr, elem, 0, arr.length - 1);
    }

    /**
     * A simple array resize method
     *
     * @param input array to be resized
     */
    public static Object[] resize(Object[] input) {
        Object[] resized = new Object[input.length * 2];
        for (int i = 0; i < input.length; i++) {
            resized[i] = input[i];
            input[i] = null;
        }
        input = null;
        return resized;
    }

    public static class Stopwatch {

        private long start, end;

        public void start() {
            this.start = System.currentTimeMillis();
        }

        public void stop() {
            this.end = System.currentTimeMillis();
        }

        public String duration() {
            return String.format("%8.4f Seconds", (end - start) / 1000.0);
        }

    }

    public static void main(String[] args) {
        sortingBenchmark();
    }

    private static void sortingBenchmark() {
        out.println("SORTING BENCHMARK");
        out.println("-----------------");
        int[] data = getRandomArray(100000);
        Stopwatch sw = new Stopwatch();

        int[] copy = data.clone();
        sw.start();
        selectionSort(copy);
        sw.stop();
        out.println("Selection sort = " + sw.duration());

        copy = data.clone();
        sw.start();
        insertonSort(copy);
        sw.stop();
        out.println("Insertion sort = " + sw.duration());

        copy = data.clone();
        sw.start();
        mergeSort(copy);
        sw.stop();
        out.println("Merge sort     = " + sw.duration());

        copy = data.clone();
        sw.start();
        quickSort(copy);
        sw.stop();
        out.println("Quick sort     = " + sw.duration());

        copy = data.clone();
        sw.start();
        heapSort(copy);
        sw.stop();
        out.println("Heap sort      = " + sw.duration());

        copy = data.clone();
        sw.start();
        Arrays.sort(copy);
        sw.stop();
        out.println("Java util's dual pivot quick sort      = " + sw.duration());

        copy = data.clone();
        sw.start();
        Arrays.parallelSort(copy);
        sw.stop();
        out.println("Java util's parallel sort      = " + sw.duration());
    }

}
