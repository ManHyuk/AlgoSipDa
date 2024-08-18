class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        return IntArray(nums.size) {
            val num = nums[it]
            var count = 0
            nums.forEachIndexed {i, v -> 
                if (it != i && v < num) {
                    count++
                }
            }
            count
        }
    }
}