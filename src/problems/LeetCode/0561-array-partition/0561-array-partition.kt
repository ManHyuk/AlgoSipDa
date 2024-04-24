class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()
        var i = 0
        var sum = 0
        while (i < nums.size) {
            sum += nums[i]
            i += 2
        }
        return sum
    }
} 