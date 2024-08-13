class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var result = mutableListOf<Boolean>()
        var max = 0

        for (i in 0..candies.lastIndex) {
            if (max < candies[i]){
                max = candies[i]
            }

        }
        for (i in 0..candies.lastIndex) {
            result.add(candies[i] + extraCandies >= max)
        } 
        return result
    } 
}