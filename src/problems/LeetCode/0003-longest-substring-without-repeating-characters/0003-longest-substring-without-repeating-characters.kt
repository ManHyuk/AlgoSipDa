class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val chars = mutableSetOf<Char>()
        var res = 0
        var l = 0
        var s = s.toCharArray()
        for (i in 0 until s.size) {
            while (s[i] in chars) chars -= s[l++]
            chars += s[i]
            res = maxOf(res, i - l + 1)
        }
        return res
    }
}