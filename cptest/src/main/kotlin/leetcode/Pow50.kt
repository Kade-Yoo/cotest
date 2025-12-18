package kr.leetcode

/**
 * Pow(x, n)
 *
 * -100.0 < x < 100.0
 * -2^31 <= n <= 2^31-1
 * n is an integer.
 * Either x is not zero or n > 0.
 * -10^4 <= xn <= 10^4
 *
 * 분할 정복 + 비트 연산
 *
 * https://leetcode.com/problems/powx-n/description/
 */
class Pow50 {

    fun myPow(x: Double, n: Int): Double {
        var longN: Long = n.toLong()
        var doubleX: Double = x

        if (longN < 0) {
            doubleX = (1 / x)
            longN = -n.toLong()
        }

        var pow = 1.0
        while (longN > 0) {
            println(("longN: $longN, doubleX: $doubleX, pow: $pow"))
            if (longN.and(1) == 1L) {
                pow *= doubleX
            }

            doubleX *= doubleX
            longN = longN.shr(1)
        }

        return pow
    }
}