class Solution {
    private fun searchEvenNos(nums: IntArray, index: Int, count: Int): Int {
        if(index == nums.size) return count
        val isEvenDigit = getDigit(nums[index]) % 2 == 0
        return searchEvenNos(nums, index+1, if(isEvenDigit) count+1 else count)
    }
    private fun getDigit(num: Int): Int {
        if(num == 0) return 0
        return 1 + getDigit(num/10)
    }
    fun findNumbers(nums: IntArray): Int {
        return searchEvenNos(nums, 0, 0)
    }
}