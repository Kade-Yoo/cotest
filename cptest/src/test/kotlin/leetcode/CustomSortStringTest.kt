package leetcode

import kr.leetcode.CustomSortString
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

class CustomSortStringTest {

    private val customSortString = CustomSortString()

    @Test
    @DisplayName("첫번째 케이스")
    fun 첫_번째_케이스() {
        val order = "cba"
        val s = "abcd"
        val result = customSortString.solution(order, s)
        assertEquals("cbad", result)
    }

    @Test
    @DisplayName("두 번째 케이스")
    fun 두_번째_케이스() {
        val order = "cbafg"
        val s = "abcd"
        val result = customSortString.solution(order, s)
        assertEquals("cbad", result)
    }

    @Test
    @DisplayName("세 번째 케이스")
    fun 세_번째_케이스() {
        val order = "kqep"
        val s = "pekeq"
        val result = customSortString.solution(order, s)
        assertEquals("kqeep", result)
    }

}