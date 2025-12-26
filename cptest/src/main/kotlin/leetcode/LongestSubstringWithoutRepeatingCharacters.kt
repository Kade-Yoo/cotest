package kr.leetcode

import java.util.*

/**
 * 3. Longest Substring Without Repeating Characters
 *
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */
class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Queue를 이용하여 현재 index에 char값이 queue에 속해있으면
     * 해당 값까지 Queue에서 요소를 제거한다. (O(1))
     * 제거 해준 후 Queue size에 max값을 구한다. (O(n))
     */
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0
        if (s.length == 1) return 1

        var maxLength = 0
        val subStringQueue: Queue<Char> = LinkedList()

        subStringQueue.add(s.first())
        (1 ..< s.length).forEach { i ->
            while (subStringQueue.contains(s[i])) {
                subStringQueue.poll()
            }

            subStringQueue.add(s[i])
            if (subStringQueue.size > maxLength) {
                maxLength = subStringQueue.size
            }
        }

        return maxLength
    }

}