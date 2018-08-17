package io.codelavida.puzzle;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;


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

}