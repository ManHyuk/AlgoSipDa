class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = hashMapOf<Int, Int>()
        for (i in nums.indices) {
            if (map.containsKey(nums[i])) if (abs(i - map[nums[i]]!!) <= k) return true
            map[nums[i]] = i
        }
        return false        
    }
}