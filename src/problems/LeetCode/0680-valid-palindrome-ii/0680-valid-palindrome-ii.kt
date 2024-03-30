class Solution {
    
    fun validPalindrome(s: String): Boolean {
        var start = 0
        var end = s.length - 1
        
        while (start < end) {
            if (s[start] != s[end]) {
                return checkPalindrome(s, start + 1, end) || checkPalindrome(s, start, end - 1)
            }
            start++
            end--
        }
        return true
    }

    private fun checkPalindrome(s: String, startIndex: Int, endIndex: Int) : Boolean {
        var start = startIndex
        var end = endIndex

        while (start < end) {
            if (s[start++] != s[end--]) return false
        }

        return true
    }
}