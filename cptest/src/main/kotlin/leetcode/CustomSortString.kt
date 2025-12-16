package kr.leetcode

/**
 * 791. Custom Sort String
 *
 * 이해가 안돼... 12월 13일
 *
 * 12월 16일 이해됨
 * 해설 : order 문자열에 정렬 순서와 동일하게 s 문자열을 정렬하고 order에 속해있지 않은 문자는 정렬한 문자열 뒤에 붙이면 된다.
 * 1. order 문자열을 Map<Char, Int>로 변환한다. Char = order각 요소, Int = order 요소의 순서
 * 2. s 문자열을 Char 요소로 반복하며 orderMap에 속한 Char이면 결과 List에 저장
 *                                          속해 있지 않으면 남은 문자열에 저장
 * 3. Map<Char, Int> Int 순서대로 결과 List 정렬
 * 4. 결과 List 요소를 나열한 후 남은 문자열과 결합하여 결과값으로 반환
 * https://leetcode.com/problems/custom-sort-string/description/
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

        customOrderedChars.sortWith { a, b ->
            orderMap[a]!! - orderMap[b]!!
        }

        return customOrderedChars.joinToString("") + remainingChars.toString()
    }
}