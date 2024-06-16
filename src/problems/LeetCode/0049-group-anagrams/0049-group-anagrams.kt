class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> =
        strs.groupBy { str -> str.groupingBy { it }.eachCount() }
            .values
            .toList()
}