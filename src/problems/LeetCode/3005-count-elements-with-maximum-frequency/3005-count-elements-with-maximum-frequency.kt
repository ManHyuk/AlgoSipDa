class Solution {
    fun maxFrequencyElements(nums: IntArray): Int {
        val occ = nums.asSequence()
            .groupingBy { it }
            .eachCount()
            .values
        val max = occ.max()

        return occ.asSequence()
            .filter { it == max }
            .reduce { acc, next -> acc + next }
    }
}