class Solution {
    fun reverse(x: Int) =
        generateSequence(x) { (it / 10).takeIf { it != 0 } }
            .map { it % 10 }
            .fold(0L) { acc, digit -> acc * 10 + digit }
            .let { if (it == it.toInt().toLong()) it.toInt() else 0 }
}