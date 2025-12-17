package kr.basic

class Recursive {

    fun sumArray(array: Array<Int>, index: Int, sum: Int): Int =
        if (array.size == index) {
            sum
        } else {
            sumArray(array, index + 1, sum + array[index])
        }

    fun sumArray2(array: Array<Int>, index: Int): Int =
        if (index == 0) {
            0
        } else {
            sumArray2(array, index - 1) + array[index - 1]
        }
}
