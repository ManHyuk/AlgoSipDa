class Solution {
    fun isPalindrome(s: String): Boolean {
        var start = 0
        var end = s.length - 1

        while (start < end) {
            while (start < end && !s[start].isLetterOrDigit()) start++
            while (end > start && !s[end].isLetterOrDigit()) end--
            if (Character.toLowerCase(s[start]) != Character.toLowerCase(s[end])) return false
            start++
            end--
        }

        return true        
    }
}