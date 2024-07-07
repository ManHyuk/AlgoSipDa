class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray =
        nums.asSequence()
            .groupingBy { it }
            .eachCount()
            .asSequence()
            .sortedByDescending { it.value }
            .map { it.key }
            .take(k)
            .toList()
            .toIntArray()
}