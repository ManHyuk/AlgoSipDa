class Solution {
    fun isMonotonic(nums: IntArray): Boolean {
        val n = nums.size
        var increase = nums.first() <= nums.last()
        var decrease = nums.first() >= nums.last()
        for (i in 0..n-2) {
            if (increase.and(nums[i] > nums[i+1])) return false
            else if (decrease.and(nums[i] < nums[i+1])) return false
        }
        return true
    }
}