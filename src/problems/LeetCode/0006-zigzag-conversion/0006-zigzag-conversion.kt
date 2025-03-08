class Solution {
    fun convert(s: String, numRows: Int): String {
        if (numRows <= 1) return s
        val cycle = (numRows - 1) * 2
        
        return (0 until numRows).flatMap { row ->
            generateSequence(row) { it + cycle }
                .takeWhile { it < s.length }
                .flatMap { idx ->
                    listOfNotNull(
                        s[idx],
                        s.getOrNull(idx + (cycle - 2 * row)).takeIf { row > 0 && row < numRows - 1 }
                    )
                }
        }.joinToString("")
    }
}