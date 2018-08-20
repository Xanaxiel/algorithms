package io.codelavida.puzzle;

import io.codelavida.ds.SinglyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Solutions to problems on <a href=https://leetcode.com>LeetCode</a>.
 * <p>
 * This is the list for Amazon:
 * [ 1, 5, 8, 20, 21, 23, 48, 49, 78, 89, 98, 100, 102, 155, 160, 167, 186,
 * 199, 200, 204, 206, 235, 239, 242]
 * ]
 */
final class LeetCode {
    private LeetCode() {
    }


    /**
     * 242. Valid Anagram
     * Given two strings s and t , write a function to determine if t
     * is an anagram of s.
     * <p>
     * You may assume the string contains only lowercase alphabets.
     * <p>
     * t is an anagram of s, if it is a permutation of s. One brute
     * force approach is to sort the two strings and check for equality.
     * The run time of this will be O(n*log(n)). Can we do better?
     *
     * @param s first string
     * @param t second string
     * @return true if t is an anagram of s otherwise false.
     */
    static boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            throw new IllegalArgumentException("Arguments must be non-null");
        }
        if (s.length() != t.length()) {
            return false;
        }
        //Use constant space - 26 letters for the alphabet.
        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * 239. Sliding Window Maximum
     * Given an array nums, there is a sliding window of size k which is moving
     * from the very left of the array to the very right. You can only see
     * the k numbers in the window. Each time the sliding window moves right
     * by one position.
     * <p>
     * Return the max sliding window.
     *
     * @param nums array of integers
     * @param k    sliding window size
     * @return arary of ints representing the max sliding window
     */
    static int[] maxSlidingWindow(int[] nums, int k) {
        return null;
    }

    /**
     * 235. Lowest Common Ancestor of a Binary Search Tree
     * <p>
     * Given a binary search tree (BST), find the lowest common ancestor
     * (LCA)  of two given nodes in the BST.
     * <p>
     * According to the definition of LCA on Wikipedia: “The lowest common
     * ancestor is defined between two nodes p and q as the lowest node in T
     * that has both p and q as descendants (where we allow a node to be a
     * descendant of itself).”
     *
     * @param root root node of the BST
     * @param p    first given node
     * @param q    second given node
     * @return find the node that is the LCA of p and q
     */
    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p,
                                         TreeNode q) {
        return null;
    }

    /**
     * 206. Reverse Linked List
     *
     * @param head head of the input singly linked list.
     * @return the reverse of the input linked list
     */
    static SinglyLinkedList<Integer> reverseList(SinglyLinkedList<Integer> head) {
        return head;
    }


    /**
     * 204. Count Primes
     * Count the number of prime numbers less than a non-negative number, n.
     *
     * @param n a positive integer.
     * @return number of primes less than n.
     */
    static int countPrimes(int n) {
        return 0;
    }

    /**
     * 200. Number of Islands
     * Given a 2d grid map of '1's (land) and '0's (water), count the number
     * of islands. An island is surrounded by water and is formed by
     * connecting adjacent lands horizontally or vertically. You may assume
     * all four edges of the grid are all surrounded by water.
     *
     * @param grid 2D grid map of 1's and 0's represented by two dimensional
     *             array of characters.
     * @return number of islands
     */
    static int numIslands(char[][] grid) {
        return 0;
    }

    /**
     * 199. Binary Tree Right Side View
     * Given a binary tree, imagine yourself standing on the right side of
     * it, return the values of the nodes you can see ordered from top to
     * bottom.
     *
     * @param root root node of the binary tree
     * @return linked list containing nodes on the right side of the binary
     * tree.
     */
    static List<Integer> rightSideView(TreeNode root) {
        if (root == null) return null;
        List<Integer> nodeList = new ArrayList<>();
        addRightSideNode(root, nodeList);
        return nodeList;
    }

    private static void addRightSideNode(TreeNode node, List<Integer> nodes) {
        if (node != null) {
            nodes.add(node.value);
            addRightSideNode(node.right, nodes);
        }
    }

    /**
     * 167. Two Sum II - Input array is sorted
     * Given an array of integers that is already sorted in ascending order,
     * find two numbers such that they add up to a specific target number.
     * <p>
     * The function twoSum should return indices of the two numbers such that
     * they add up to the target, where index1 must be less than index2.
     *
     * @param numbers array of integers
     * @param target  the target sum
     * @return array of two integers whose sum is target.
     */
    static int[] twoSumSorted(int[] numbers, int target) {

        return null;
    }

    /**
     * 160. Intersection of Two Linked Lists
     * <p>
     * Write a program to find the node at which the intersection of two
     * singly linked lists begins.
     * <p>
     * If the two linked lists have no intersection at all, return null.
     *
     * @param headA head of the list 1
     * @param headB head of the list 2
     * @return node at which the intersection begins otherwise null.
     */
    static List<Integer> getIntersectionNode(List<Integer> headA,
                                             List<Integer> headB) {
        return null;

    }

    /**
     * 155. Min Stack
     * Design a stack that supports push, pop, top, and retrieving the
     * minimum element in constant time.
     * <p>
     * push(x) -- Push element x onto stack.
     * pop() -- Removes the element on top of the stack.
     * top() -- Get the top element.
     * getMin() -- Retrieve the minimum element in the stack.
     */
    static class MinStack {

        /**
         * initialize your data structure here.
         */
        public MinStack() {

        }

        public void push(int x) {

        }

        public void pop() {

        }

        public int top() {
            return 0;

        }

        public int getMin() {
            return 0;

        }
    }


    /**
     * 102. Binary Tree Level Order Traversal
     * Given a binary tree, return the level order traversal of its nodes'
     * values. (ie, from left to right, level by level).
     *
     * @param root root of the binary tree
     * @return level order traversal
     */
    static List<List<Integer>> levelOrder(TreeNode root) {
        return null;
    }

    /**
     * 100. Same Tree.
     * Given two binary trees, write a function to check if they are the same
     * or not.
     * <p>
     * Two binary trees are considered the same if they are structurally
     * identical and the nodes have the same value.
     * <p>
     * Brute Force: in-order traverse the two trees and compare until
     * exhausted (True) or nodes don't match.
     *
     * @param p first binary tree
     * @param q second binary tree
     * @return if p and q are same otherwise false.
     */
    static boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> pNodes = new ArrayList<>();
        ArrayList<Integer> qNodes = new ArrayList<>();
        inorder(p, pNodes);
        inorder(q, qNodes);
        return Arrays.equals(pNodes.toArray(), qNodes.toArray());
    }

    /**
     * class to represent a binary tree node
     */
    static class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int value;

        TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

    }

    private static void inorder(TreeNode node, ArrayList<Integer> nodes) {
        if (node != null) {
            nodes.add(node.value);
            inorder(node.left, nodes);
            inorder(node.right, nodes);
        }
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
    boolean isWildCardMatch(String s, String p) {
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
    String multiply(String num1, String num2) {
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
    int trap(int[] heights) {
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
    int firstMissingPositive(int[] nums) {
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
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
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
    static String countAndSay(int n) {
        return null;
    }

    /**
     * 37. Sudoku Solver
     * <p>
     * Write a program to getSolution a Sudoku puzzle by filling the empty cells.
     *
     * @param board two dimensional array of characters
     */
    static void solveSudoku(char[][] board) {

    }

    /**
     * 36. Valid Sudoku
     * <p>
     * Determine if a 9x9 Sudoku board is valid.
     *
     * @param board two dimensional array of characters
     * @return true if the board is valid or false
     */
    static boolean isValidSudoku(char[][] board) {
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
    static int searchInsert(int[] nums, int target) {
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
    static int[] searchRange(int[] nums, int target) {
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
    static int search(int[] nums, int target) {
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
    static int longestValidParentheses(String s) {
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
    static void nextPermutation(int[] nums) {

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
    static List<Integer> findSubstring(String s, String[] words) {
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
    static int divide(int dividend, int divisor) {
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
    static int strStr(String str, String substr) {
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
    static int removeElement(int[] nums, int val) {
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
    static int removeDuplicates(int[] nums) {
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
    static List<Object> reverseKGroup(List<Object> list, int k) {
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
    static List<Object> swapPairs(List<Object> list) {
        return null;
    }

    /**
     * 23. Merge k Sorted Lists
     * <p>
     * Merge k sorted linked lists and return it as one sorted list.
     * Analyze and getDescription its complexity.
     *
     * @param lists k sorted lists
     * @return merged list
     */
    static List<Object> mergeKLists(List<Object>[] lists) {
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
    static List<String> generateParenthesis(int n) {
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
    static List<Object> mergeTwoLists(List<Object> l1, List<Object> l2) {
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
    static boolean isValid(String s) {
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
    static List<Object> removeNthFromEnd(List<Object> list, int n) {
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
    static List<List<Integer>> fourSum(int[] nums, int target) {
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
    static List<String> letterCombinations(String digits) {
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
    static int threeSumClosest(int[] nums, int target) {
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
    static List<List<Integer>> threeSum(int[] nums) {
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
    static String longestCommonPrefix(String[] strs) {

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
    static int romanToInt(String s) {
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
    static String intToRoman(int num) {
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
    static int maxArea(int[] heights) {
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
    boolean isMatch(String s, String p) {
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
    static boolean isPalindrome(int x) {
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
    static int myAtoi(String str) {
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
    static int reverse(int x) {
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
    static String convert(String s, int numRows) {
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
    static String longestPalindrome(String s) {
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
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {

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
    static int lengthOfLongestSubstring(String s) {

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
    static List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2) {
        List<Integer> sum = null;


        return sum;
    }


    /**
     * 1. Two Sum
     * <p>
     * Given an array of integers, return indices of the two number such that
     * they add up to a specific target.
     * <p>
     * We can getSolution this O(n^2) time with two for loops. Another solution is to
     * use a hash map (additional O(n) space) to find the solution in O(n) time.
     *
     * @param nums:   array of integers
     * @param target: integer that is the sum of two numbers in the array.
     */
    static int[] twoSum(int[] nums, int target) {
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
