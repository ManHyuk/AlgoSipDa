class Solution {
    fun findSpecialInteger(arr: IntArray): Int = 
        arr.groupBy { it }
            .maxBy { it.value.size }
            .key
}