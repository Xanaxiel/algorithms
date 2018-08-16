package io.codelavida.puzzle;

final class ArrayMinMax implements Problem {
    private ArrayMinMax() {
    }

    private static int numComparisons = 0;

    @Override
    public String getName() {
        return "Array Min Max";
    }

    @Override
    public String getDescription() {
        return "Given an array of integers, find the maximum and minimum of the \n" +
                "array. Constraint: Find the answer in minimum number of comparisons.";
    }

    @Override
    public String getSolution() {
        return "The brute force approach is to sort the array O(nlog(n)) and\n" +
                "return the first and last element in the array. A better brute\n" +
                "force approach is to use two variables to store the result and\n" +
                "update it using one loop. Runtime O(n) 2*n comparisons. An\n" +
                "improvement is to take two items from the array in one\n" +
                "iteration and compare the two. Then compare the smaller of\n " +
                "the two with min and the larger one with the max. Runtime\n" +
                "O(n) with 1.5*n comparisons. We can use a divide and conquer\n" +
                "approach which is approach. We split the array in two halves\n" +
                "and find the min and max in the subarrays. We then compare the\n" +
                "results of the subarrays to find the ultimate min, max. The base\n" +
                "case is an array of single element which is min and max.";
    }

    static class MinMax {
        private int min;
        private int max;

        MinMax(int min, int max) {
            this.min = min;
            this.max = max;
        }

        int getMin() {
            return min;
        }

        int getMax() {
            return max;
        }
    }

    static MinMax findMinMax(int[] arr) {
        numComparisons = 1;
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Invalid input");
        }
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length / 2; i++) {
            int n1 = arr[2 * i];
            int n2 = arr[2 * i + 1];
            numComparisons++;
            if (n1 < n2) {
                min = Math.min(min, n1);
                max = Math.max(max, n2);
            } else {
                min = Math.min(min, n2);
                max = Math.max(max, n1);
            }
        }
        numComparisons++;
        if (arr.length % 2 == 1) {
            int n = arr[arr.length - 1];
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        MinMax minmax = new MinMax(min, max);
        System.out.println("Number of comparisons = " + numComparisons);
        return minmax;
    }

    /**
     * @param arr input array
     * @return an array of two integers min and max value in the arr
     */
    static MinMax findMinMaxDC(int[] arr) {
        numComparisons = 1;
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Invalid input");
        }
        MinMax minmax = findMinMaxRecur(arr, 0, arr.length - 1);
        System.out.println("Number of comparisons = " + numComparisons);
        return minmax;
    }

    private static MinMax findMinMaxRecur(int[] arr, int low, int high) {

        numComparisons++;
        if (low > high) {
            return null;
        }
        numComparisons++;
        if (low == high) {
            return new MinMax(arr[low], arr[high]);
        }

        int mid = (low + high) / 2;

        MinMax left = findMinMaxRecur(arr, low, mid);
        MinMax right = findMinMaxRecur(arr, mid + 1, high);

        numComparisons++;
        if (left == null) return right;

        numComparisons++;
        if (right == null) return left;

        return new MinMax(
                Math.min(left.min, right.min),
                Math.max(left.max, right.max)
        );
    }

}
