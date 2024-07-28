class Solution {
    fun shuffle(nums: IntArray, n: Int) = 
        nums
            .zip(nums.drop(n))
            .flatMap { it.toList() }
}