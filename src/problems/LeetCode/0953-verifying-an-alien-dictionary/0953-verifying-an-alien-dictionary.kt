class Solution {
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        val indexMap = order.toList().zip(0 until 26).toMap()
        fun orderedAlright(first: String, second: String): Boolean {
            first.zip(second).map {
                if (indexMap[it.first]!! < indexMap[it.second]!!)
                    return true
                if (indexMap[it.first]!! > indexMap[it.second]!!)
                    return false
            }
            return first.length <= second.length
        }

        return words.zip(words.slice(IntRange(1, words.size - 1))).map { orderedAlright(it.first, it.second) }
            .all { it }
    }
}