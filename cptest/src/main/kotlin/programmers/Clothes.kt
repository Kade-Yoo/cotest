package kr.programmers

/**
 * 의상
 *
 * Constraints
 * - 의상은 1개 이상 착용할 수 있다.
 * - 각 종류 별 최대 1개 착용할 수 있다.
 * - 같은 이름에 의상은 존재 하지 않는다.
 */
class Clothes {
//    fun solution(clothes: Array<Array<String>>): Int {
//        var answer = 0
//
//        val clothesMap = mutableMapOf<String, Int>()
//        clothes.forEach {
//            clothesMap.putIfAbsent(it[1], clothesMap.getOrDefault(it[1], 0) + 1)
//        }
//
//        val list = clothesMap.map { it.value }
//        list.forEachIndexed { index, i ->
//            var multiply = i
//            for (j in index until index + j) {
//                multiply *= list[j]
//            }
//
//            answer += multiply
//        }
//
//        return list.sum() + answer
//    }

    fun solution2(clothes: Array<Array<String>>): Int {
        val clothesMap = mutableMapOf<String, Int>()
        clothes.forEach {
            val orDefault = clothesMap.getOrDefault(it[1], 0)
            clothesMap[it[1]] = orDefault + 1
        }

        val list = clothesMap.map { it.value }
        var answer = 0
        list.forEachIndexed { index, _ ->
            answer += multiply(list, index, index + 1, 1)
        }

        return answer
    }

    private fun multiply(list: List<Int>, index: Int, size: Int, multiply: Int): Int {
        if (index == size) {
            return multiply
        }

        for (i in index until index + size) {
            println("$multiply * ${list[i]} , $i , $size")
            multiply(list, i + 1, size + i, multiply * list[i])
        }

        return multiply
    }
}