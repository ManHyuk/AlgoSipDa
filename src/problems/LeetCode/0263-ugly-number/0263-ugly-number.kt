class Solution {
    fun isUgly(n: Int): Boolean {
        if (n <= 0) {
            return false
        }

        var number = n
        while (number > 1) {
            when {
                number and 0x1 == 0 -> number = number shr 1
                number % 3 == 0 -> number = number / 3
                number % 5 == 0 -> number = number / 5
                else -> return false
            }
        }
        return true
    }
}