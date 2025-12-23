package kr.leetcode

/**
 * 1922. Count Good Numbers
 *
 * https://leetcode.com/problems/count-good-numbers/
 */
class CountGoodNumbers {

    fun countGoodNumbers(n: Long): Int {
        if (n == 1L) {
            return 5
        }

        var index: Long = n / 2
        var answer = 1L
        var indexMultiply = 20L
        while (index > 0) {
            if (index.and(1) == 1L) {
                answer = (answer * indexMultiply)  % 1_000_000_007
            }

            index = index.shr(1)
            indexMultiply = (indexMultiply * indexMultiply) % 1_000_000_007
        }

        if (n % 2 == 1L) {
            answer = (answer * 5) % 1_000_000_007
        }

        return (answer % 1_000_000_007).toInt()
    }
}