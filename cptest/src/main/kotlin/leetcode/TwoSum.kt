package kr.leetcode


/**
 * Two Sum
 *
 * nums 인 숫자 배열과 목표 값 target 이 주어진다.
 * nums 에서 요소를 2개 뽑아 target 값이 되는 요소의 index를 구하라.
 *
 * Constraints
 * 2 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 *
 * 1차 시도 : 성공 - O((n^2+n)/2)
 * https://leetcode.com/problems/two-sum/
 */
class TwoSum {

    class Solution {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            nums.forEachIndexed { index, first ->
                for (i in (index+1)..< nums.size) {
                    if (first + nums[i] == target) {
                        return intArrayOf(index, i)
                    }
                }
            }

            throw Exception("Fail")
        }
    }
}