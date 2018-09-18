package io.codelavida

import scala.collection.mutable


object LeetCode {

  def twoSum(nums: List[Int], target: Int): (Int, Int) = {

    val indexMap = mutable.Map[Int, Int]()
    var res = (-1, -1)
    var index = 0
    while (index < nums.length) {
      if (indexMap.contains(target - nums(index))) {
        res = (indexMap(target - nums(index)), index)
      }
      indexMap(nums(index)) = index
      index += 1
    }

    res
  }
}