class Solution {
    fun minRemoveToMakeValid(s: String) = buildString {
        val indexes = mutableListOf<Int>()
        s.forEach {
            when (it) {
                '(' -> indexes.add(length)
                ')' -> if (!indexes.isEmpty()) indexes.removeLast()
                       else return@forEach
            }
            append(it)
        }
        indexes.reversed().forEach {
            deleteAt(it)
        }
    }
}