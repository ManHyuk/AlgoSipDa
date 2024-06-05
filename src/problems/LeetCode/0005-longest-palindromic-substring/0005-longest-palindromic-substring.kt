class Solution {
    fun longestPalindrome(s: String): String {
        var ans = IntArray(2) { 0 }
        for (i in 0 until s.length) {
            calculateAns(ans, s, i, i)
            calculateAns(ans, s, i, i+1)
        }
        return s. substring(ans[0], ans[1]+1)
    }

    private fun calculateAns(ans: IntArray, s: String, i: Int, j: Int) {
        var left = i
        var right = j
        var len = s.length
        while (left >= 0 && right < len && s[left] == s[right]) {
            left --
            right ++
        }

        if ((right-left) > (ans[1]-ans[0]+1)) {
            ans[0] = left +1
            ans[1] = right -1
        } 
    }
}