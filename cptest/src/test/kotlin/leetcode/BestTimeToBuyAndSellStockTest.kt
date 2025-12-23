package leetcode

import kr.leetcode.BestTimeToBuyAndSellStock
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class BestTimeToBuyAndSellStockTest {

    private val bestTimeToBuyAndSellStock = BestTimeToBuyAndSellStock()

    @Test
    fun maxProfit() {
        assertEquals(5, bestTimeToBuyAndSellStock.maxProfit(intArrayOf(7,1,5,3,6,4)))
        assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(intArrayOf(7,6,4,3,1)))
        assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(intArrayOf(1)))
        assertEquals(2, bestTimeToBuyAndSellStock.maxProfit(intArrayOf(2,4,1)))
    }
}