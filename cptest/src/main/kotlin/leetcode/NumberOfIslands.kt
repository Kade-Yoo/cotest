package kr.leetcode

/**
 * 200. Number of Islands
 *
 * water('0')로 갇혀 있는 섬 갯수를 찾아라
 * dps or bfs 로 풀면 가능할 듯
 * https://leetcode.com/problems/number-of-islands/description/
 */
class NumberOfIslands {

    fun numIslands(grid: Array<CharArray>): Int {
        val checkedGrid: Array<Array<Boolean>> = Array(grid.size) { Array(grid[0].size) { false } }

        var result = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == '1' && !checkedGrid[i][j]) {
                    dps(grid, checkedGrid, i, j)
                    result++
                }
            }
        }

        return result
    }

    private val directions = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
    private fun dps(grid: Array<CharArray>, checkedGrid: Array<Array<Boolean>>, x: Int, y: Int) {
        if (!(x >= 0 && y >= 0 && x < grid.size && y < grid[x].size)) {
            return
        }

        if (grid[x][y] == '1' && !checkedGrid[x][y]) {
            checkedGrid[x][y] = true
            for (direction in directions) {
                dps(grid, checkedGrid, x + direction.first, y + direction.second)
            }
        }
    }
}