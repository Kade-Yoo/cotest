package basic

import kr.basic.Recursive
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class RecursiveTest {
    @Test
    @DisplayName("배열 합 구하기")
    fun sumArray() {
        val recursive = Recursive()
        val array = arrayOf(1, 2, 3, 4, 5)
        val sum = recursive.sumArray(array, 0, 0)
        assertEquals(15, sum)
    }

    @Test
    @DisplayName("배열 합 구하기2")
    fun sumArray2() {
        val recursive = Recursive()
        val array = arrayOf(1, 2, 3, 4, 5)
        val sum = recursive.sumArray2(array, array.size)
        assertEquals(15, sum)
    }

}