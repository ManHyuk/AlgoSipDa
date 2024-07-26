class Solution {
    fun minimumOperations(nums: IntArray): Int =
        nums.fold(0){res, n -> if (n % 3 > 0) res + 1 else res};
    
}