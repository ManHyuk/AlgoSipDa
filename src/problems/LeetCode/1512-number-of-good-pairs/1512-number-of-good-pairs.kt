class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()

        for ( i in nums ) {
           map[i] = map.getOrDefault(i, 0) + 1
        }

        var result = 0
        
        for ( v in map.values ) {
            if(v > 1) {
                result += v * (v - 1) / 2
            }
        }

        return result
        
    }
}