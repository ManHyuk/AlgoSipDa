class Solution {
    fun missingNumber(nums: IntArray): Int {
       val range = 0..nums.size
       return range.sum() - nums.sum()
    }
}