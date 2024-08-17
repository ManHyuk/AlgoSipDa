class Solution {
    fun countPairs(nums: List<Int>, target: Int): Int {
        var count = 0
        for(i in 0 until nums.size-1) {
            for(j in i+1 until nums.size) {
                if(nums[i] + nums[j] < target) {
                    count++
                }
            }
        }
        return count
    }
}