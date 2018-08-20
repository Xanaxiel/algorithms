package io.codelavida.puzzle;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

import static io.codelavida.puzzle.LeetCode.TreeNode;
import static io.codelavida.puzzle.LeetCode.isSameTree;


public class LeetCodeTest {

    @Test
    public void testTwoSum() {
        int[] nums = new int[]{2, 7, 11, 15};

        assertThat(LeetCode.twoSum(nums, 13)).isEqualTo(new int[]{0, 2});
        assertThat(LeetCode.twoSum(nums, 10)).isEqualTo(new int[2]);
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

}