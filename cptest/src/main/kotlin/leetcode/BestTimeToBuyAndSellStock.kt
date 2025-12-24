package kr.leetcode

/**
 * 121. Best Time to Buy and Sell Stock
 *
 * 1차 시도 : Time Limit Exceeded
 * 2차 시도 : 카데인 알고리즘 적용
 * 시간 복잡도 : O(N)
 *
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
class BestTimeToBuyAndSellStock {

    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var minPrice = prices[0]
        for (i in 1..<prices.size) {
            minPrice = minPrice.coerceAtMost(prices[i])
            maxProfit = maxProfit.coerceAtLeast(prices[i] - minPrice)
        }

        return maxProfit
    }
}