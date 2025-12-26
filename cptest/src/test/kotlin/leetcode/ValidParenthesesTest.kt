package leetcode

import kr.leetcode.ValidParentheses
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ValidParenthesesTest {

    private val validParentheses = ValidParentheses()

    @Test
    fun isValid() {
        assertTrue(validParentheses.isValid("()"))
        assertTrue(validParentheses.isValid("()[]{}"))
        assertFalse(validParentheses.isValid("(]"))
        assertFalse(validParentheses.isValid("([)]"))
        assertTrue(validParentheses.isValid("{[]}"))
        assertFalse(validParentheses.isValid("]"))
        assertFalse(validParentheses.isValid("("))
        assertFalse(validParentheses.isValid("){"))
        assertFalse(validParentheses.isValid("({{{{}}}))"))
        assertFalse(validParentheses.isValid("([]){"))
    }

}