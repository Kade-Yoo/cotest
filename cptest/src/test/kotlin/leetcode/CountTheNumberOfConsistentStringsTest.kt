package leetcode

import kr.leetcode.CountTheNumberOfConsistentStrings
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

class CountTheNumberOfConsistentStringsTest {

    private val countTheNumberOfConsistentStrings = CountTheNumberOfConsistentStrings()

    @Test
    @DisplayName("첫 번째 케이스")
    fun testFirstCase() {
        val result = countTheNumberOfConsistentStrings.solution("ab", arrayOf("ad", "bd", "aaab", "baa", "badab"))
        assertEquals(2, result)
    }

    @Test
    @DisplayName("두 번째 케이스")
    fun testSecondCase() {
        val result = countTheNumberOfConsistentStrings.solution("abc", arrayOf("a", "b", "c", "ab", "ac", "bc", "abc"))
        assertEquals(7, result)
    }

    @Test
    @DisplayName("세 번째 케이스")
    fun testThirdCase() {
        val result = countTheNumberOfConsistentStrings.solution("cad", arrayOf("cc", "acd", "b", "ba", "bac", "bad", "ac", "d"))
        assertEquals(4, result)
    }

    @Test
    @DisplayName("네 번째 케이스")
    fun testFourthCase() {
        val result = countTheNumberOfConsistentStrings.solution("ab", arrayOf("a", "b"))
        assertEquals(2, result)
    }

    @Test
    @DisplayName("다섯 번째 케이스")
    fun testFifthCase() {
        val result = countTheNumberOfConsistentStrings.solution("a", arrayOf("b", "c", "d"))
        assertEquals(0, result)
    }

    @Test
    @DisplayName("여섯 번째 케이스")
    fun testSixthCase() {
        val result = countTheNumberOfConsistentStrings.solution("ab", arrayOf("ab", "a", "b"))
        assertEquals(3, result)
    }

}