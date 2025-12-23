package leetcode

import kr.leetcode.CountGoodNumbers
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CountGoodNumbersTest {

    private val countGoodNumbers = CountGoodNumbers()

    @Test
    fun countGoodNumbers() {
        assertEquals(5, countGoodNumbers.countGoodNumbers(1))
        assertEquals(20, countGoodNumbers.countGoodNumbers(2))
        assertEquals(400, countGoodNumbers.countGoodNumbers(4))
        assertEquals(564908303, countGoodNumbers.countGoodNumbers(50))
    }

}