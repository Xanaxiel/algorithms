package io.codelavida

import org.scalatest._

class LeetCodeSpec extends FlatSpec with Matchers {

  "Two Sum" should "return a tuple of two elements that sum to target" in {
    val nums = List(10, 2, 23, 41, 5, 16)
    LeetCode.twoSum(nums, 46) should be((3, 4))
  }

}
