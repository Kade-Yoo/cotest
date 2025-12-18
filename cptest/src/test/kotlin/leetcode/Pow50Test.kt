package leetcode

import kr.leetcode.Pow50
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Pow50Test {
    @Test
    @DisplayName("+- Pow 를 구하시오")
    fun myPow() {
        val pow50 = Pow50()
        assertEquals(1024.00000, pow50.myPow(2.00000, 10))
        assertEquals(9.26100, pow50.myPow(2.10000, 3), 0.00001)
        assertEquals(0.25000, pow50.myPow(2.00000, -2))
        assertEquals(1.00000, pow50.myPow(1.00000, 0))
        assertEquals(1.00000, pow50.myPow(1.00000, 2147483647))
        assertEquals(1.00000, pow50.myPow(1.00000, -2147483648))
    }

}