package leetcode

import kr.leetcode.NumberOfIslands
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class NumberOfIslandsTest {

    private val numberOfIslands = NumberOfIslands()

    @Test
    fun numIslands() {
        val grid = arrayOf(
            charArrayOf('1', '1', '1', '1', '0'),
            charArrayOf('1', '1', '0', '1', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0')
        )
        val result = numberOfIslands.numIslands(grid)
        assertEquals(1, result)
    }

    @Test
    fun numIslands2() {
        val grid = arrayOf(
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '1', '0', '0'),
            charArrayOf('0', '0', '0', '1', '1')
        )
        val result = numberOfIslands.numIslands(grid)
        assertEquals(3, result)
    }

    @Test
    fun numIslands3() {
        val grid = arrayOf(
            charArrayOf('0', '0', '0', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0')
        )
        val result = numberOfIslands.numIslands(grid)
        assertEquals(0, result)
    }

    @Test
    fun numIslands4() {
        val grid = arrayOf(
            charArrayOf('1')
        )
        val result = numberOfIslands.numIslands(grid)
        assertEquals(1, result)
    }

    @Test
    fun numIslands5() {
        val grid = arrayOf(
            charArrayOf('1', '0', '1'),
            charArrayOf('0', '1', '0'),
            charArrayOf('1', '0', '1')
        )
        val result = numberOfIslands.numIslands(grid)
        assertEquals(5, result)
    }

}