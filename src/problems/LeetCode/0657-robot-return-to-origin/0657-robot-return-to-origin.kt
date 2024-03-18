class Solution {
    fun judgeCircle(moves: String): Boolean {
      return moves.fold(0 to 0) { acc, move ->
            when (move) {
                'U' -> (acc.first + 1) to acc.second
                'D' -> (acc.first - 1) to acc.second
                'L' -> acc.first to (acc.second - 1)
                'R' -> acc.first to (acc.second + 1)
                else -> acc.first to acc.second
            }
        }.toList().all { it == 0 }     
    }
}