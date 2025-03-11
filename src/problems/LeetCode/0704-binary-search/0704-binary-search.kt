class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1

        while (right >= left) {
            val mid = (left + right) / 2
            if (nums[mid] == target) {
                return mid
            } else if (nums[mid] > target) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return -1
    }

}