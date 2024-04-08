class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map = mutableMapOf<Int, Int>()

        arr.forEach { i ->
            map.put(i, (map.get(i) ?: 0 ) + 1)
        }

        return map.values.size == map.values.toSet().size        
    }
}