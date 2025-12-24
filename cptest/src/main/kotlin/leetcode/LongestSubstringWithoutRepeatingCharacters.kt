package kr.leetcode

/**
 * 3. Longest Substring Without Repeating Characters
 *
 * 카데인 알고리즘 써야하는데.. 어렵네..
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */
class LongestSubstringWithoutRepeatingCharacters {

    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }

        if (s.length == 1) {
            return 1
        }

        var maxLengthString = s.toCharArray().first().toString()
        var maxLength = maxLengthString.length

        var index = 1
        var indexAfterStart = 0
        while(index < s.length) {
            val char = s.toCharArray()[index]
            if (maxLengthString.contains(char)) {
                index = indexAfterStart
                maxLengthString = s.toCharArray()[indexAfterStart].toString()
                indexAfterStart += 1
            } else {
                maxLengthString += char
            }

            if (maxLength < maxLengthString.length) {
                maxLength = maxLengthString.length
            }

            index++
        }

        return maxLength
    }

    fun lengthOfLongestSubstringBySlidingWindow(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }

        var maxLength = 0
        val charSet = mutableSetOf<Char>()
        var left = 0

        for (right in s.indices) {
            while (charSet.contains(s[right])) {
                charSet.remove(s[left])
                left++
            }
            charSet.add(s[right])
            maxLength = maxOf(maxLength, right - left + 1)
        }

        return maxLength
    }

}