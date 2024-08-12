class Solution {
    fun orArray(nums: IntArray): IntArray {
        val size = nums.size
        val result = IntArray(size - 1)

        for (i in 0 until size - 1) {
            result[i] = nums[i] or nums[i + 1]
        }
        return result
    }
}