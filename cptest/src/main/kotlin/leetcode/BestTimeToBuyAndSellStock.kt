package kr.leetcode

/**
 * 121. Best Time to Buy and Sell Stock
 *
 * 1차 시도 : Time Limit Exceeded
 * 시간 복잡도 : O(10^5 * 10^5 / 2)
 * 카데인 알고리즘 활용 필요 근데.. 부분합은 이해가 되는데 적용방법이 이해가 안된다..
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
class BestTimeToBuyAndSellStock {

    fun maxProfit(prices: IntArray): Int {
        var maxValue = Int.MAX_VALUE
        prices.forEachIndexed { index, firstForValue ->
            for (i in (index + 1) ..< prices.size) {
                if (maxValue < prices[i] - firstForValue) {
                    maxValue = prices[i] - firstForValue
                }
            }
        }

        return maxValue
    }
}