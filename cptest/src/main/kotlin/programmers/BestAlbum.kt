package kr.programmers

class BestAlbum {

    /**
     * 베스트 앨범
     * https://school.programmers.co.kr/learn/courses/30/lessons/42579
     *
     * 1차 시도 정확성 33.3 (2025년 8월 8일)
     */
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        // 장르별 총 재생 횟수 계산
        val genrePlayCount = mutableMapOf<String, MutableMap<Int, Int>>()
        val genrePlaySum = mutableMapOf<String, Long>()

        // 각 장르별로 곡의 재생 횟수를 저장
        genres.forEachIndexed { index, genre ->
            // 반복문을 잉요해서 점차이에 특ㅎ
            val genreMap = genrePlayCount.getOrDefault(genre, mutableMapOf())
            genreMap[index] = plays[index]
            genrePlayCount[genre] = genreMap
            genrePlaySum[genre] = ((genrePlaySum[genre] ?: 0) + plays[index])
        }

        // 큰 총합 정렬
        val sortedByDescending = genrePlaySum.toList().sortedByDescending { it.second }
        val answer = mutableListOf<Int>()
        sortedByDescending.forEachIndexed { index, pair ->
            if (index > 1) {
                return@forEachIndexed
            }

            val sortedByDescending1 = genrePlayCount[pair.first]?.toList()?.sortedByDescending { it.second }
            sortedByDescending1?.forEachIndexed { index2, pair2 ->
                if (index2 > 1) {
                    return@forEachIndexed
                }

                answer.add(pair2.first)
            }
        }


        return answer.toIntArray()
    }
}