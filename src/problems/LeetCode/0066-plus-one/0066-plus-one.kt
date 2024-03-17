class Solution {
    fun plusOne(digits: IntArray): IntArray = solve(digits, digits.size-1)
    
    tailrec fun solve(digits: IntArray, anchor: Int) : IntArray =
        when {
            anchor == -1 -> intArrayOf(1).plus(digits)
            digits[anchor] == 9 -> {
                digits[anchor] = 0
                solve(digits, anchor -1)
            }
            else -> {
                digits[anchor] = digits[anchor] + 1
                digits
            }
        }
}