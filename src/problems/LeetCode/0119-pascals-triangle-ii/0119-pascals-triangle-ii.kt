class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        return generateSequence(listOf(1)) { prev -> listOf(1) + prev.windowed(2, 1).map { it.sum() } + listOf(1) }
            .take(rowIndex + 1)
            .toList()[rowIndex]     
    }
}