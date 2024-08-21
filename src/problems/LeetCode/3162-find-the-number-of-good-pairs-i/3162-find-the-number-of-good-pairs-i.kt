class Solution {
    fun numberOfPairs(nums1: IntArray, nums2: IntArray, k: Int): Int {
        return nums1
        .flatMapIndexed { i, num1 -> 
            nums2.map { num2 -> if (num1 % (num2 * k) == 0) 1 else 0 }
            }
        .sum()
    }
}
