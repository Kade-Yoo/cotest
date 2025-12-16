package kr.leetcode

/**
 * 791. CustomSortString
 *
 *
 * link : https://leetcode.com/problems/custom-sort-string/
 */
class CustomSortString {

    fun solution(order: String, s: String): String {
        val orderMap = mutableMapOf<Char, Int>()
        order.forEachIndexed { index, ch ->
            orderMap[ch] = index + 1
        }

        val customOrderedChars = mutableListOf<Char>()
        val remainingChars = StringBuilder()
        s.toCharArray().forEach {
            if (orderMap.containsKey(it)) {
                customOrderedChars.add(it)
            } else {
                remainingChars.append(it)
            }
        }

        customOrderedChars.sortWith(Comparator { a, b ->
            orderMap[a]!! - orderMap[b]!!
        })

        return customOrderedChars.joinToString("") + remainingChars.toString()
    }
}