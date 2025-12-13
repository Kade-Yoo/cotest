package kr.leetcode

/**
 * 유니크 모스 부호 단어
 *
 * 1. 모스부호에 해당하는 각 문자열을 알파벳과 맵핑 시킨다.
 * 2. 입력받은 words를 반복문을 통해 모스부호의 조합으로 만든다.
 * 3. Set으로 변환한다. (중복 문자열 제거 위함)
 * 4. Set의 사이즈를 반환한다. (문제에서 요구하는 결과값)
 *
 * link : https://leetcode.com/problems/unique-morse-code-words/description/
 */
class UniqueMorseCodeWords {

    private val letters = listOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")

    fun getSolution(words: Array<String>): Int {
        val letterMap = initLetterMap()
        val resultSet = words.map { word ->
            var resultValue = ""
            word.map { letter -> resultValue += letterMap[letter] }

            return@map resultValue
        }.toSet()

        return resultSet.size
    }

    private fun initLetterMap(): Map<Char, String> {
        val letterMap = HashMap<Char, String>()
        for (i in 'a' .. 'z') {
            letterMap[i] = letters[i - 'a']
        }
        return letterMap
    }
}