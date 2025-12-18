package leetcode

import kr.leetcode.PowerOfTwo
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PowerOfTwoTest {

    private val powerOfTwo = PowerOfTwo()

    @Test
    fun isPowerOfTwo() {
        assertTrue(powerOfTwo.isPowerOfTwo(1))
        assertTrue(powerOfTwo.isPowerOfTwo(16))
        assertFalse(powerOfTwo.isPowerOfTwo(3))
        assertTrue(powerOfTwo.isPowerOfTwo(4))
        assertFalse(powerOfTwo.isPowerOfTwo(5))
        assertFalse(powerOfTwo.isPowerOfTwo(0))
        assertFalse(powerOfTwo.isPowerOfTwo(-16))
    }

}