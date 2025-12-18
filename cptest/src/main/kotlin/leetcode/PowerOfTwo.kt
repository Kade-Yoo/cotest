package kr.leetcode

/**
 * 231. Power Of Two
 *
 * 비트 연산자 and를 이용하여 2^n 제곱에 해당하면 count 증가
 * count == 1이면 2^n으로 구현할 수 있기 때문에 true 반환
 * https://leetcode.com/problems/power-of-two/description/
 */
class PowerOfTwo {

    fun isPowerOfTwo(n: Int): Boolean {
        var binaryCount = 0
        var shrN = n
        while (shrN > 0) {
            if (shrN.and(1) == 1) {
                binaryCount++
            }

            shrN = shrN.shr(1)
        }

        return binaryCount == 1
    }
}