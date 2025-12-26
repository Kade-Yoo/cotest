package kr.leetcode

import java.util.LinkedList
import java.util.Queue
import java.util.Stack
import java.util.Vector

/**
 * 20. Valid Parentheses
 *
 * https://leetcode.com/problems/valid-parentheses/description/
 */
class ValidParentheses {

    fun isValid(s: String): Boolean {
        val pairMap = mapOf('(' to ')', '{' to '}', '[' to ']')
        val openStack: Stack<Char> = Stack()

        var result = false
        for (ch in s) {
            if (pairMap.keys.contains(ch)) {
                openStack.add(ch)
                result = false
            } else if (pairMap.values.contains(ch)) {
                if (!openStack.isEmpty() && pairMap[openStack.pop()] == ch) {
                    result = true
                } else {
                    return false
                }
            }
        }

        if (openStack.isNotEmpty()) {
            return false
        }

        return result
    }
}