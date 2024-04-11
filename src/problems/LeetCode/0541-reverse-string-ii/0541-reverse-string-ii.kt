class Solution {
    tailrec fun reverseStr(s: String, k: Int): String {
        if (s.isBlank() || s.length <= k) return s.reversed()
        val maxAfter = Math.min(s.length-1, k+k)
        return s.substring(0, k).reversed() + s.substring(k, maxAfter) + reverseStr(s.substring(maxAfter), k)
    }
}