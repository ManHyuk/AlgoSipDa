class Solution {
    fun titleToNumber(columnTitle: String): Int {
        return columnTitle.fold(0) { result, char -> result * 26 + (char - 'A' + 1) }
    }
}