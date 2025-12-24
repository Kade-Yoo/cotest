package leetcode

import kr.leetcode.LongestSubstringWithoutRepeatingCharacters
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LongestSubstringWithoutRepeatingCharactersTest {

    private val longestSubstringWithoutRepeatingCharacters = LongestSubstringWithoutRepeatingCharacters()

    @Test
    fun lengthOfLongestSubstring() {
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"))
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"))
        assertEquals(0, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(""))
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("a"))
        assertEquals(2, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("au"))
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("dvdf"))
        assertEquals(2, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("aab"))
    }

}