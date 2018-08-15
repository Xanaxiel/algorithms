package io.codelavida.puzzle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Solutions to problems on <a href=https://leetcode.com>LeetCode</a>.
 */
public final class LeetCode {
    private LeetCode() {
    }


    /**
     * 44. Wildcard Matching
     * <p>
     * Given an input string (s) and a pattern (p), implement wildcard
     * pattern matching with support for '?' and '*'.
     *
     * @param s input string
     * @param p pattern to be matched
     * @return true if p matches entire string s
     */
    public boolean isWildCardMatch(String s, String p) {
        return false;
    }

    /**
     * 43. Multiply Strings
     * <p>
     * Given two non-negative integers num1 and num2 represented as strings,
     * return the product of num1 and num2, also represented as a string.
     *
     * @param num1 string representation of first number
     * @param num2 string representation of second number
     * @return product of num1 and num2 represented as a string.
     */
    public String multiply(String num1, String num2) {
        return null;
    }

    /**
     * 42. Trapping Rain Water
     * <p>
     * Given n non-negative integers representing an elevation map where the
     * width of each bar is 1, compute how much water it is able to trap after
     * raining.
     *
     * @param heights n non-negative integers
     * @return units of water.
     */
    public int trap(int[] heights) {
        return 0;
    }

    /**
     * 41. First Missing Positive
     * <p>
     * Given an unsorted integer array, find the smallest missing positive
     * integer.
     *
     * @param nums an unsorted array of integers.
     * @return the smallest missing number.
     */
    public int firstMissingPositive(int[] nums) {
        return 0;
    }

    /**
     * 40. Combination Sum II
     * <p>
     * Given a collection of candidate numbers (candidates) and a target number
     * (target), find all unique combinations in candidates where the candidate
     * numbers sums to target.
     * <p>
     * Each number in candidates may only be used once in the combination.
     * <p>
     * Note:
     * <p>
     * All numbers (including target) will be positive integers.
     * The solution set must not contain duplicate combinations.
     *
     * @param candidates a set of candidates as an integer array
     * @param target     a target number
     * @return unique combinations in candidates
     */
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        return null;
    }

    /**
     * 39. Combination Sum
     * <p>
     * Given a set of candidate numbers (candidates) (without duplicates) and a
     * target number (target), find all unique combinations in candidates where
     * the candidate numbers sums to target.
     * <p>
     * The same repeated number may be chosen from candidates unlimited number of
     * times.
     *
     * @param candidates a set of candidates as an integer array
     * @param target     a target number
     * @return unique combinations in candidates
     */
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        return null;
    }

    /**
     * 38. Count and Say
     * <p>
     * The count-and-say sequence is the sequence of integers with the first five
     * terms as following:
     * <p>
     * 1.     1
     * 2.     11
     * 3.     21
     * 4.     1211
     * 5.     111221
     * <p>
     * 1 is read off as "one 1" or 11.
     * 11 is read off as "two 1s" or 21.
     * 21 is read off as "one 2, then one 1" or 1211.
     * <p>
     * Given an integer n, generate the nth term of the count-and-say sequence.
     * <p>
     * Note: Each term of the sequence of integers will be represented as a string.
     *
     * @param n integer term
     * @return string representation of the nth term
     */
    public static String countAndSay(int n) {
        return null;
    }

    /**
     * 37. Sudoku Solver
     * <p>
     * Write a program to solve a Sudoku puzzle by filling the empty cells.
     *
     * @param board two dimensional array of characters
     */
    public static void solveSudoku(char[][] board) {

    }

    /**
     * 36. Valid Sudoku
     * <p>
     * Determine if a 9x9 Sudoku board is valid.
     *
     * @param board two dimensional array of characters
     * @return true if the board is valid or false
     */
    public static boolean isValidSudoku(char[][] board) {
        return false;
    }

    /**
     * 35. Search Insert Position
     * <p>
     * Given a sorted array and a target value, return the index if the target
     * is found. If not, return the index where it would be if it were inserted
     * in order.
     * <p>
     * You may assume no duplicates in the array.
     *
     * @param nums   array of integers
     * @param target the target to search for
     * @return index of target
     */
    public static int searchInsert(int[] nums, int target) {
        return 0;
    }

    /**
     * 34. Find First and Last Position of Element in Sorted Array
     * <p>
     * Given an array of integers nums sorted in ascending order, find the
     * starting and ending position of a given target value. Your algorithm's
     * runtime complexity must be in the order of O(log n). If the target is
     * not found in the array, return [-1, -1].
     *
     * @param nums   array of integers
     * @param target the target to search for
     * @return first and last index of target
     */
    public static int[] searchRange(int[] nums, int target) {
        int[] indices = {-1, -1};
        return indices;
    }

    /**
     * 33. Search in Rotated Sorted Array
     * <p>
     * Suppose an array sorted in ascending order is rotated at some pivot
     * unknown to you beforehand (i.e., [0,1,2,4,5,6,7] might become
     * [4,5,6,7,0,1,2]). You are given a target value to search. If found
     * in the array return its index, otherwise return -1. You may assume no
     * duplicate exists in the array.
     * <p>
     * Your algorithm's runtime complexity must be in the order of O(log n).
     *
     * @param nums   array of integers
     * @param target integer to search for in the array
     * @return index of the target if found otherwise -1
     */
    public static int search(int[] nums, int target) {
        return -1;
    }

    /**
     * 32. Longest Valid Parentheses
     * <p>
     * Given a string containing just the characters '(' and ')', find the
     * length of the longest valid (well-formed) parentheses substring.
     *
     * @param s input string
     * @return length of the longest valid substring
     */
    public static int longestValidParentheses(String s) {
        return 0;

    }

    /**
     * 31. Next Permutation
     * <p>
     * Implement next permutation, which rearranges numbers into the
     * lexicographically next greater permutation of numbers. If such
     * arrangement is not possible, it must rearrange it as the lowest
     * possible order (ie, sorted in ascending order).
     * <p>
     * The replacement must be in-place and use only constant extra memory.
     *
     * @param nums array of integers.
     */
    public static void nextPermutation(int[] nums) {

    }

    /**
     * 30. Substring with Concatenation of All Words
     * <p>
     * You are given a string, s, and a list of words, words, that are
     * all of the same length. Find all starting indices of substring(s)
     * in s that is a concatenation of each word in words exactly once and
     * without any intervening characters.
     *
     * @param s     input string s
     * @param words list of words
     * @return starting indices of substrings
     */
    public static List<Integer> findSubstring(String s, String[] words) {
        return null;
    }

    /**
     * 29. Divide Two Integers
     * <p>
     * Given two integers dividend and divisor, divide two integers
     * without using multiplication, division and mod operator.
     *
     * @param dividend integer 32 bit signed
     * @param divisor  integer 32 bit signed
     * @return result of division
     */
    public static int divide(int dividend, int divisor) {
        return 0;
    }

    /**
     * 28. Implement strStr()
     * <p>
     * Return the index of the first occurrence of substr in str,
     * or -1 if needle is not part of haystack.
     *
     * @param str    input string
     * @param substr substring to be found
     * @return index if found else -1
     */
    public static int strStr(String str, String substr) {
        return -1;
    }

    /**
     * 27. Remove Element
     * <p>
     * Given an array nums and a value val, remove all instances of
     * that value in-place and return the new length
     *
     * @param nums input array
     * @param val  the value to be removed
     * @return new length of the array.
     */
    public static int removeElement(int[] nums, int val) {
        return val;
    }

    /**
     * 26. Remove Duplicates from Sorted Array
     * <p>
     * Given a sorted array nums, remove the duplicates in-place such
     * that each element appear only once and return the new length.
     *
     * @param nums input array
     * @return length of the array
     */
    public static int removeDuplicates(int[] nums) {
        return nums.length;
    }

    /**
     * 25. Reverse Nodes in k-Group
     * <p>
     * Given a linked list, reverse the nodes of a linked list k at
     * a time and return its modified list. k is a positive integer and
     * is less than or equal to the length of the linked list. If the
     * number of nodes is not a multiple of k then left-out nodes in
     * the end should remain as it is.
     *
     * @param list input linked list
     * @param k    a positive integer
     * @return reversed list
     */
    public static List<Object> reverseKGroup(List<Object> list, int k) {
        return null;
    }

    /**
     * 24. Swap Nodes in Pairs
     * <p>
     * Given a linked list, swap every two adjacent nodes and return
     * its head.
     *
     * @param list input list
     * @return resulting list after swapping
     */
    public static List<Object> swapPairs(List<Object> list) {
        return null;
    }

    /**
     * 23. Merge k Sorted Lists
     * <p>
     * Merge k sorted linked lists and return it as one sorted list.
     * Analyze and describe its complexity.
     *
     * @param lists k sorted lists
     * @return merged list
     */
    public static List<Object> mergeKLists(List<Object>[] lists) {
        return null;
    }

    /**
     * 22. Generate Parentheses
     * <p>
     * Given n pairs of parentheses, write a function to generate all
     * combinations of well-formed parentheses.
     *
     * @param n integer representing number of parentheses
     * @return all combinations of well formed parentheses
     */
    public static List<String> generateParenthesis(int n) {
        return null;
    }

    /**
     * 21. Merge Two Sorted Lists
     * <p>
     * Merge two sorted linked lists and return it as a new list. The new list
     * should be made by splicing together the nodes of the first two lists.
     *
     * @param l1 first sorted list
     * @param l2 second sorted list
     * @return merged list
     */
    public static List<Object> mergeTwoLists(List<Object> l1, List<Object> l2) {
        return null;
    }

    /**
     * 20. Valid Parentheses
     * <p>
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
     * determine if the input string is valid.
     * <p>
     * An input string is valid if:
     *
     * <ul>
     * <li>Open brackets must be closed by the same type of brackets.</li>
     * <li>Open brackets must be closed in the correct order.</li>
     * </ul>
     * <p>
     * Note that an empty string is also considered valid.
     *
     * @param s input string
     * @return true if the string s is valid
     */
    public static boolean isValid(String s) {
        return false;
    }

    /**
     * 19. Remove Nth Node From End of List
     * <p>
     * Given a linked list, remove the n-th node from the end of list
     * and return its head.
     *
     * @param list input list
     * @param n    position of the node from the end
     * @return resulting list after removal of the element
     */
    public static List<Object> removeNthFromEnd(List<Object> list, int n) {
        return null;
    }

    /**
     * 18. 4Sum
     * <p>
     * Given an array nums of n integers and an integer target, are there elements
     * a, b, c, and d in nums such that a + b + c + d = target? Find all unique
     * quadruplets in the array which gives the sum of target.
     *
     * @param nums   array nums of n integers
     * @param target integer target
     * @return list of quadruplets
     */
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        return null;
    }

    /**
     * 17. Letter Combinations of a Phone Number
     * <p>
     * Given a string containing digits from 2-9 inclusive, return all possible
     * letter combinations that the number could represent.
     *
     * @param digits string of digits
     * @return all possible combinations
     */
    public static List<String> letterCombinations(String digits) {
        return null;

    }

    /**
     * 16. 3Sum Closest
     * <p>
     * Given an array nums of n integers and an integer target, find three
     * integers in nums such that the sum is closest to target. Return the
     * sum of the three integers. You may assume that each input would have
     * exactly one solution.
     *
     * @param nums   nums of n integers
     * @param target integer target
     * @return sum of the three integers such that sum is closest to target
     */
    public static int threeSumClosest(int[] nums, int target) {
        return 0;
    }

    /**
     * 15. 3Sum
     * <p>
     * Given an array nums of n integers, are there elements a, b, c in nums
     * such that a + b + c = 0? Find all unique triplets in the array which
     * gives the sum of zero.
     *
     * @param nums array nums of n integers
     * @return unique triplets in the array which gives the sum of zero
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        return null;
    }

    /**
     * 14. Longest Common Prefix
     * <p>
     * Write a function to find the longest common prefix string amongst an
     * array of strings. If there is no common prefix, return an empty string
     * "".
     *
     * @param strs array of strings
     * @return longest common prefix string
     */
    public static String longestCommonPrefix(String[] strs) {

        return null;
    }

    /**
     * 13. Roman to Integer
     * <p>
     * Given a roman numeral, convert it to an integer. Input is guaranteed to
     * be within the range from 1 to 3999.
     *
     * @param s roman numeral
     * @return integer
     */
    public static int romanToInt(String s) {
        return 0;

    }

    /**
     * 12. Integer to Roman
     * <p>
     * Given an integer, convert it to a roman numeral. Input is guaranteed to
     * be within the range from 1 to 3999
     *
     * @param num input integer
     * @return roman number of num
     */
    public static String intToRoman(int num) {
        return null;

    }

    /**
     * 11. Container With Most Water
     * <p>
     * Given n non-negative integers a1, a2, ..., an , where each represents a
     * point at coordinate (i, ai). n vertical lines are drawn such that the
     * two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which
     * together with x-axis forms a container, such that the container contains
     * the most water.
     *
     * @param heights array of integers
     * @return maximum area
     */
    public static int maxArea(int[] heights) {
        return 0;
    }

    /**
     * 10. Regular Expression Matching
     * <p>
     * Given an input string (s) and a pattern (p), implement regular
     * expression matching with support for '.' and '*'.
     *
     * @param s input: could be empty and contains only lowercase letters a-z.
     * @param p pattern: could be empty and contains only lowercase letters a-z,
     *          and characters like . or *.
     * @return true if matching covers the entire input string (not partial).
     */
    public boolean isMatch(String s, String p) {
        return false;
    }

    /**
     * 9. Palindrome Number
     * <p>
     * Determine whether an integer is a palindrome. An integer is a
     * palindrome when it reads the same backward as forward.
     *
     * @param x integer
     * @return true if x is palindrome otherwise false
     */
    public static boolean isPalindrome(int x) {
        return false;
    }

    /**
     * 8. String to Integer (atoi)
     * <p>
     * Implement atoi which converts a string to an integer.
     *
     * @param str alphanumeric string with optional whitespaces.
     * @return find the number as long as a non-digit is found.
     */
    public static int myAtoi(String str) {
        return 0;
    }

    /**
     * 7. Reverse Integer
     * <p>
     * Given a 32-bit signed integer, reverse digits of an integer.
     *
     * @param x integer to be reversed
     * @return reversed integer
     */
    public static int reverse(int x) {
        return 0;
    }

    /**
     * 6. ZigZag Conversion
     * <p>
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a given
     * number of rows like this: (you may want to display this pattern in a
     * fixed font for better legibility)
     * <p>
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * <p>
     * And then read line by line: "PAHNAPLSIIGYIR"
     *
     * @param s       input string
     * @param numRows number of rows
     * @return string after the conversion
     */
    public static String convert(String s, int numRows) {
        return null;
    }

    /**
     * 5. Longest Palindromic Substring
     * <p>
     * Given a string s, find the longest palindromic substring in s. You may
     * assume that the maximum length of s is 1000.
     *
     * @param s input string
     * @return longest substring in s that is palindromic
     */
    public static String longestPalindrome(String s) {
        return null;
    }

    /**
     * 4. Median of Two Sorted Arrays
     * <p>
     * There are two sorted arrays nums1 and nums2 of size m and n respectively.
     * Find the median of the two sorted arrays. The overall run time complexity
     * should be O(log (m+n)). You may assume nums1 and nums2 cannot be both empty.
     *
     * @param nums1 first sorted array
     * @param nums2 second sorted array
     * @return median of the two sorted arrays.
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        return 0.0;
    }

    /**
     * 3. Longest Substring Without Repeating Characters
     * <p>
     * Given a string, find the length of the longest substring without
     * repeating characters.
     *
     * @param s input string
     * @return integer representing length of the longest substring.
     */
    public static int lengthOfLongestSubstring(String s) {

        return 0;
    }

    /**
     * 2. Add Two Numbers
     * <p>
     * You are given two non-empty linked lists representing two non-negative
     * integers. The digits are stored in reverse order and each of their nodes
     * contain a single digit. Add the two numbers and return it as a linked list.
     * <p>
     * You may assume the two numbers do not contain any leading zero, except
     * the number 0 itself.
     *
     * @param l1 linked list representing the first number in reverse
     * @param l2 linked list representing the first number in reverse
     * @return sum of the two numbers as a linked list in reverse
     */
    public static List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2) {
        List<Integer> sum = null;


        return sum;
    }


    /**
     * 1. Two Sum
     * <p>
     * Given an array of integers, return indices of the two number such that
     * they add up to a specific target.
     * <p>
     * We can solve this O(n^2) time with two for loops. Another solution is to
     * use a hash map (additional O(n) space) to find the solution in O(n) time.
     *
     * @param nums:   array of integers
     * @param target: integer that is the sum of two numbers in the array.
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException(
                    "Null or invalid length array");
        }

        int[] indices = new int[2];

        Map<Integer, Integer> numsMap = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i])) {
                indices[1] = i;
                indices[0] = numsMap.get(target - nums[i]);
                return indices;
            }
            numsMap.put(nums[i], i);
        }

        return indices;

    }

}