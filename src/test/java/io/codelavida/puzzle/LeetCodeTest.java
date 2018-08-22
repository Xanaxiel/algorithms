package io.codelavida.puzzle;

import io.codelavida.ds.SinglyLinkedList;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

import static io.codelavida.puzzle.LeetCode.TreeNode;
import static io.codelavida.puzzle.LeetCode.isSameTree;
import static io.codelavida.puzzle.LeetCode.longestPalindrome;
import static io.codelavida.puzzle.LeetCode.lowestCommonAncestor;


public class LeetCodeTest {

    @Test
    public void testLongestPalindrome() {
        assertThat(longestPalindrome(null)).isNull();
        assertThat(longestPalindrome("")).isEmpty();
        assertThat(longestPalindrome("a")).isEqualTo("a");
        assertThat(longestPalindrome("ab")).isEqualTo("a");
        assertThat(longestPalindrome("aba")).isEqualTo("aba");
        assertThat(longestPalindrome("baba")).isEqualTo("aba");
        assertThat(longestPalindrome("abba")).isEqualTo("abba");
        assertThat(longestPalindrome("gabba")).isEqualTo("abba");
    }

    @Test
    public void testTwoSum() {
        int[] nums = {21, 2, 17, 11, 15};

        assertThat(LeetCode.twoSum(nums, 19)).isEqualTo(new int[]{1, 2});
        assertThat(LeetCode.twoSum(nums, 10)).isEqualTo(new int[]{-1, -1});
    }

    @Test
    public void testTwoSumSorted() {
        int[] nums = {2, 7, 11, 15, 17, 20};

        assertThat(LeetCode.twoSumSorted(nums, 13)).isEqualTo(new int[]{0, 2});
        assertThat(LeetCode.twoSumSorted(nums, 10)).isEqualTo(new int[]{-1, -1});
    }

    @Test
    public void testMaxProfit() {
        int[] prices = {10, 11, 9, 12, 7, 10, 11};
        assertThat(LeetCode.maxProfit(prices)).isEqualTo(4);
    }

    @Test
    public void testIsAnagram() {
        assertThat(LeetCode.isAnagram("aloha", "holaa")).isTrue();
        assertThat(LeetCode.isAnagram("alohas", "holaa")).isFalse();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsAnagramNullArgument() {
        LeetCode.isAnagram(null, "");
    }

    @Test
    public void testIsSameTree() {
        TreeNode tn1 = new TreeNode(10,
                new TreeNode(20,
                        new TreeNode(15, null, null),
                        new TreeNode(22, null, null)),
                new TreeNode(30,
                        new TreeNode(25, null, null),
                        new TreeNode(32, null, null)));

        TreeNode tn2 = new TreeNode(10,
                new TreeNode(20,
                        new TreeNode(15, null, null),
                        new TreeNode(22, null, null)),
                new TreeNode(30,
                        new TreeNode(15, null, null),
                        new TreeNode(22, null, null)));

        TreeNode tn3 = new TreeNode(10,
                new TreeNode(20,
                        new TreeNode(15, null, null),
                        new TreeNode(22, null, null)),
                new TreeNode(30,
                        new TreeNode(15, null, null),
                        new TreeNode(22, null, null)));

        assertThat(isSameTree(tn1, tn2)).isFalse();
        assertThat(isSameTree(tn2, tn3)).isTrue();
    }

    @Test
    public void testLowestCommonAncestor() {
        TreeNode t1 = new TreeNode(3, null, null);
        TreeNode t2 = new TreeNode(7, null, null);
        TreeNode t3 = new TreeNode(5, t1, t2);

        TreeNode t4 = new TreeNode(15, null, null);
        TreeNode t5 = new TreeNode(25, null, null);
        TreeNode t6 = new TreeNode(20, t4, t5);

        TreeNode root = new TreeNode(10, t3, t6);

        assertThat(lowestCommonAncestor(root, t1, t4)).isEqualTo(root);
        assertThat(lowestCommonAncestor(root, t1, t2)).isEqualTo(t3);
        assertThat(lowestCommonAncestor(root, t4, t5)).isEqualTo(t6);
    }

    @Test
    public void testReverseSinglyLinkedList() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.reverse();

        assertThat(list.get(0)).isEqualTo(30);
        assertThat(list.get(1)).isEqualTo(20);
        assertThat(list.get(2)).isEqualTo(10);
    }

}