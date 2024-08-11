class Solution {
    fun findPermutationDifference(s: String, t: String): Int {
        var sum = 0
        for (i in s.indices){
            sum += abs(i - t.indexOf(s[i]))
        } 
        return sum
    }
}