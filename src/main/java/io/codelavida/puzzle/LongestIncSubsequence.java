package io.codelavida.puzzle;

public class LongestIncSubsequence implements Problem {
    @Override
    public String getName() {
        return "Longest Increasing Sub-sequence";
    }

    @Override
    public String getDescription() {
        return "You are given an integer array. Find the longest sub-sequences\n" +
                "of the array which has the elements in increasing order. B is\n" +
                "a sub-sequence of array A if B can be formed by removing some\n" +
                "elements from the array A without disturbing the order of\n" +
                "elements. For example {2,5,6,1,3} is the input array, Then\n" +
                "{2,5}, {2,6}, {2,6,1}, {2,1,3} are some of its sub-sequences.\n" +
                "In these {2,5}, {2,6} are increasing sub-sequences. The longest\n" +
                "sub-sequence is of length 3";
    }

    @Override
    public String getSolution() {
        return "Brute Force:\n" +
                "The number of sub-sequences is a set of size 2^n. So brute force" +
                " is to check all of the sub-sequences for increasing order and " +
                "then return the length of the longest one.\n" +
                "Dynamic Programming:\n" +
                "In this we will use memoization to solve the problem. At any\n" +
                "index i, the sub-problem is to find the longest sub-sequence\n" +
                "of the array until index i For i+1, we can reuse the results\n" +
                "from the previous sub-problem. The runtime complexity of this\n" +
                "problem is O(n*k) where n is the number of elements and k is the\n" +
                "number of increasing sub-sequences in the array which depends\n" +
                "on the original ordering of the array.";
    }

    static int longestIncSubseq(int[] arr) {
        return longestIncSubseq(arr, 0, arr.length - 1);
    }

    private static int longestIncSubseq(int[] arr, int low, int high) {

        return 0;
    }

}
