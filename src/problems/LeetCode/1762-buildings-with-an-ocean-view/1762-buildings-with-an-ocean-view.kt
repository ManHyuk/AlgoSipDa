class Solution {
    fun findBuildings(heights: IntArray): IntArray {
        var highestHeight = 0 // ocean level
        var result = mutableListOf<Int>()

        for (i in heights.size - 1 downTo 0) {
            if (highestHeight < heights[i]) {
                result.add(i)
                highestHeight = heights[i]
            }
        }

        return result.reversed().toIntArray()
    }
}