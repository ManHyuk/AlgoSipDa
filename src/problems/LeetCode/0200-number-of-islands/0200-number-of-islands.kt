class Solution {
    fun numIslands(grid: Array<CharArray>): Int {

        val visited = mutableSetOf<Pair<Int,Int>>()
        var count = 0

        for ( row in grid.indices ) {
            for (col in 0 until grid[0].size) {
                if(explore(grid, row, col, visited) == true) {
                    count++
                }
            }
        }

        return count
    }


    private fun explore(grid: Array<CharArray>, row: Int, col: Int, visited: MutableSet<Pair<Int,Int>> ) : Boolean {
        val isRowInBound = row <= grid.size - 1 && row >= 0
        val isColumnInBound = col <= grid[0].size - 1 && col >= 0
        if(!isRowInBound || !isColumnInBound) return false

        if(visited.contains(row to col)) return false
        visited.add(row to col)

        if(grid[row][col] == '0') return false

        explore(grid, row - 1, col, visited) // Vertical
        explore(grid, row + 1, col, visited) // Vertical
        explore(grid, row, col + 1, visited) // Horizontal
        explore(grid, row, col - 1, visited) // Horizontal

        return true

    }
}