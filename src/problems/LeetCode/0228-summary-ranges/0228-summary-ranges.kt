class Solution {
    fun summaryRanges(nums: IntArray): List<String> = nums
        .fold(mutableListOf<IntArray>()) { r, t ->
            if (r.isEmpty() || r.last()[1] + 1 < t) r += intArrayOf(t, t)
            else r.last()[1] = t
            r
        }
        .map { (f, t) -> if (f == t) "$f" else "$f->$t"}
}