class Solution {
    fun longestRepeatingSubstring(s: String): Int {
        val seenSubstrings: MutableSet<String> = HashSet()
        var maxLength = s.length - 1
        var start = 0
        while (start <= s.length && maxLength != 0) {
            val end = start
            if (end + maxLength > s.length) {
                maxLength--
                start = 0
                seenSubstrings.clear()
            } else {
                val currentSubstring = s.substring(end, end + maxLength)
                if (!seenSubstrings.add(currentSubstring)) {
                    return currentSubstring.length
                }

                start++
            }
        }
        return maxLength
    }
}