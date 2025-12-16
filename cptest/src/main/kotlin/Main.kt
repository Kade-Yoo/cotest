package kr

import kr.programmers.BestAlbum
import kr.programmers.Clothes

fun main() {
    val bestAlbum = BestAlbum()

//    val genre = arrayOf("classic", "pop", "classic", "classic", "pop")
//    val genre = arrayOf("pop")
//    val genre = arrayOf("a", "b", "c")
//    val genre = arrayOf("a", "a", "b", "b")
//    val genre = arrayOf("classic", "pop", "classic", "classic", "pop")

//    val plays = intArrayOf(500, 600, 150, 800, 2500)
//    val plays = intArrayOf(100)
//    val plays = intArrayOf(100, 200, 300)
//    val plays = intArrayOf(100, 100, 90, 90)
//    val plays = intArrayOf(500, 600, 150, 800, 2500)

//    bestAlbum.solution(genre, plays)

    val clothes = Clothes()
    val value = Array(size = 3, init = { arrayOf("yellow_hat", "headgear") })
    value[1] = arrayOf("blue_sunglasses", "eyewear")
    value[2] = arrayOf("green_turban", "headgear")

    clothes.solution2(value)
}