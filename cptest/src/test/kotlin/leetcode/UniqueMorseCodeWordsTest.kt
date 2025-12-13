package leetcode

import kotlin.test.assertEquals
import kr.leetcode.UniqueMorseCodeWords
import org.junit.jupiter.api.Test

class UniqueMorseCodeWordsTest {

    private val uniqueMorseCodeWords = UniqueMorseCodeWords()

    @Test
    fun 첫_번째_케이스() {
        val input: Array<String> = arrayOf("gin","zen","gig","msg")
        val output = uniqueMorseCodeWords.getSolution(input)

        assertEquals(2, output)
    }

    @Test
    fun 두_번째_케이스() {
        val input: Array<String> = arrayOf("a")
        val output = uniqueMorseCodeWords.getSolution(input)

        assertEquals(1, output)
    }

    @Test
    fun 세_번째_케이스() {
        val input: Array<String> = arrayOf("rwjfs","dxz","mcx","muge","lfp","gws","tfo","nfn","moe","ntg")
        val output = uniqueMorseCodeWords.getSolution(input)

        assertEquals(10, output)
    }

}