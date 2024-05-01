class Solution {
    fun check(nums: IntArray): Boolean {
        val n = nums.size
        var k = 0
        for (i in 0..n-1) {
            if (nums[i] > nums[(i+1)%n]) k++
            if (k > 1) return false
        }
        return true
    }
}