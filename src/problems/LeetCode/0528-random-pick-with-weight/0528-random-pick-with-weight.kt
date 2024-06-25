class Solution(w: IntArray) {
    val prefixSum: IntArray

    init {
        prefixSum = w.copyOf()
        for (i in 1 until prefixSum.size) {
            prefixSum[i] += prefixSum[i - 1]
        }
    }

    fun pickIndex(): Int {
        val n = prefixSum[prefixSum.lastIndex]
        val random = (1..n).random()
        val result = prefixSum.binarySearch(random)
        return if(result >= 0) result else -result - 1
    }

}

/**
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(w)
 * var param_1 = obj.pickIndex()
 */

/**
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(w)
 * var param_1 = obj.pickIndex()
 */