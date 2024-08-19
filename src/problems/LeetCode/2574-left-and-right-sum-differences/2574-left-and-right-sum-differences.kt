class Solution {
        fun leftRightDifference(nums: IntArray): IntArray {
        val n = nums.size
        val leftSum = mutableListOf(0)
        val rightSum = mutableListOf(0)

        for(i in 0..<n-1) {
            leftSum.add(leftSum[i]+nums[i])
            rightSum.add(rightSum[i]+nums[n-i-1])
        }
        return leftSum.mapIndexed {i, ele -> abs(ele-rightSum[n-i-1])  }.toIntArray()
    }
}