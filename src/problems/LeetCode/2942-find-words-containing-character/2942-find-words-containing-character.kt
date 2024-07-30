class Solution {
    fun findWordsContaining(a: Array<String>, x: Char): List<Int> {
        return (0 until a.size)
            .filter { it -> x in a[it]}
            .toList()
    }
}