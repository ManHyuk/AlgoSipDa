class Solution {
    fun numMagicSquaresInside(grid: Array<IntArray>): Int {
        var count = 0
    
    fun isMagic(r: Int, c: Int): Boolean {
        val s = HashSet<Int>()
        for (i in 0..2) {
            for (j in 0..2) {
                val num = grid[r + i][c + j]
                if (num < 1 || num > 9 || !s.add(num)) return false
            }
        }
        
        val sum1 = grid[r][c] + grid[r][c + 1] + grid[r][c + 2]  // Row 1
        val sum2 = grid[r + 1][c] + grid[r + 1][c + 1] + grid[r + 1][c + 2]  // Row 2
        val sum3 = grid[r + 2][c] + grid[r + 2][c + 1] + grid[r + 2][c + 2]  // Row 3
        val sum4 = grid[r][c] + grid[r + 1][c] + grid[r + 2][c]  // Column 1
        val sum5 = grid[r][c + 1] + grid[r + 1][c + 1] + grid[r + 2][c + 1]  // Column 2
        val sum6 = grid[r][c + 2] + grid[r + 1][c + 2] + grid[r + 2][c + 2]  // Column 3
        val sum7 = grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2]  // Diagonal 1
        val sum8 = grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c]  // Diagonal 2
        
        return sum1 == 15 && sum2 == 15 && sum3 == 15 &&
               sum4 == 15 && sum5 == 15 && sum6 == 15 &&
               sum7 == 15 && sum8 == 15
    }
    
    for (r in 0 until grid.size - 2) {
        for (c in 0 until grid[0].size - 2) {
            if (grid[r + 1][c + 1] == 5 && isMagic(r, c)) {
                count++
            }
        }
    }
    
    return count
    }
}