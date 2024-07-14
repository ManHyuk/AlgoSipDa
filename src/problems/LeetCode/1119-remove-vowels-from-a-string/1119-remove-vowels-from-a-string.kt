class Solution {
    fun removeVowels(s: String): String {
        val vowels = mutableListOf<Char>('a','e','i','o','u')
        return s.filter{ !vowels.contains(it)}.toString()
    }
}