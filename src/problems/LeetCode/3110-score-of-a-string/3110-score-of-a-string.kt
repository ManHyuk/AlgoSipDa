
class Solution {
    fun scoreOfString(s: String) = s.zipWithNext { a, b -> kotlin.math.abs(a - b) }.sum()
}