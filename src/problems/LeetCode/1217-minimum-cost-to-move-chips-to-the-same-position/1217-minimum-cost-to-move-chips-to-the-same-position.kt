class Solution {
    fun minCostToMoveChips(position: IntArray): Int {
        var oddSum = 0
        var evenSum = 0
        for (i in 0..position.size - 1) {
            if (position[i] % 2 != 0) {
                oddSum += 1
            } else {
                evenSum += 1
            }
        }
        return Math.min(oddSum, evenSum)
    }
}