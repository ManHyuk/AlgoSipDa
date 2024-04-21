class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        for (i in cost.lastIndex - 2 downTo 0) {
            cost[i] += Math.min(cost[i + 1], cost[i + 2])
        }

        return Math.min(cost[0], cost[1])
    }
}