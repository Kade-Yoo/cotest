package kr.programmers

class BestAlbum {

    /**
     * 베스트 앨범
     * https://school.programmers.co.kr/learn/courses/30/lessons/42579
     *
     * 1차 시도 정확성 33.3 (2025년 8월 8일)
     * - 왜 실패 했을까? 실패 케이스를 찾아보자
     * - 내용 이해를 잘못한 것 같다? 가장 재생 수가 많은 앨범 2개가 아닌 "장르 별로 가장 많이 재생된 노래를 두 개씩 모아"이다.
     * 2차 시도.. 맞았다..
     * - 장르 2개 중 노래 2개가 아니였다 모든 장르에서.. 2개씩 뽑아서 였다...허허허허허허허허허허허
     * 그리고 중요한 사항은 장르가 1개일 수도 있고, 노래가 1개일 수도 있다 꼭 노래 2개를 선정하는 것이 아니기 때문에 배열에서 2개를 하드코딩으로 선정해서는 안된다(OutOfBoundArray)
     *
     * 의견
     * sort 함수로 편하게 구현했지만 sort 함수를 구현하지 않고 쉽게 구현할 수 있는 방법이 있을까?
     * 코드 라인을 줄일 수 있는 방법이 있을까?
     */
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        // 장르별 총 재생 횟수 계산
        val genrePlayCount = mutableMapOf<String, MutableMap<Int, Int>>()
        val genrePlaySum = mutableMapOf<String, Long>()

        // 각 장르별로 곡의 재생 횟수를 저장
        genres.forEachIndexed { index, genre ->
            val genreMap = genrePlayCount.getOrDefault(genre, mutableMapOf())
            genreMap[index] = plays[index]
            genrePlayCount[genre] = genreMap
            genrePlaySum[genre] = ((genrePlaySum[genre] ?: 0) + plays[index])
        }

        // 큰 총합 정렬
        val sortedByDescending = genrePlaySum.toList().sortedByDescending { it.second }
        val answer = mutableListOf<Int>()
        sortedByDescending.forEachIndexed { ind, j ->
            val key = j.first
            val map = genrePlayCount[key]
            if (!map.isNullOrEmpty()) {
                map.toList().sortedByDescending { genrePlay -> genrePlay.second }
                    .map { genrePlay -> genrePlay.first }
                    .forEachIndexed { index, i ->
                        if (index > 1) {
                            return@forEachIndexed
                        }

                        answer.add(i)
                    }
            }
        }

        return answer.toIntArray()
    }
}