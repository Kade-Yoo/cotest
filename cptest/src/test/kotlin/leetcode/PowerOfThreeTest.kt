package leetcode

import kr.leetcode.PowerOfThree
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PowerOfThreeTest {
    private val powerOfThree = PowerOfThree()

    @Test
    fun isPowerOfThree() {
        assertTrue(powerOfThree.isPowerOfThree(27))
        assertFalse(powerOfThree.isPowerOfThree(0))
        assertTrue(powerOfThree.isPowerOfThree(9))
        assertFalse(powerOfThree.isPowerOfThree(45))
        assertTrue(powerOfThree.isPowerOfThree(1))
        assertFalse(powerOfThree.isPowerOfThree(-3))
        assertFalse(powerOfThree.isPowerOfThree(-1))
    }

}