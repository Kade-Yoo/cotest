package kr.leetcode

/**
 * 326. Power Of Three
 *
 * 3으로 나누면서 3으로만 나눌 수 있는지 확인 (0, 1 예외 처리)
 * https://leetcode.com/problems/power-of-three/description/
 */
class PowerOfThree {

    fun isPowerOfThree(n: Int): Boolean {
        var powerThreeN = n
        if (powerThreeN < 3) {
            return powerThreeN == 1
        }

        while (powerThreeN / 3 != 1) {
            if (powerThreeN % 3 > 0) {
                return false
            }

            powerThreeN /= 3
        }

        return powerThreeN % 3 == 0
    }
}