package io.codelavida.puzzle;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;


public class LeetCodeTest {

    @Test
    public void testTwoSum() {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] indinces = new int[]{0,2};
        assertThat(LeetCode.twoSum(nums, 13)).isEqualTo(indinces);
    }

}