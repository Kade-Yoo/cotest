package kr.leetcode

/**
 * 1684. Count the Number of Consistent Strings
 *
 * 1. words[i].char 가 allowed 에 포함 되어있는
 * 2. length 와 words[i].length 가 같을 때
 * 3. 갯수
 *
 * link : https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
 */
class CountTheNumberOfConsistentStrings {

    fun solution(allowed: String, words: Array<String>): Int =
        words
            .filter { it.filter { character -> allowed.contains(character) }.length == it.length }
            .size
}