class Solution {
    fun addDigits(num: Int): Int {
        return sumOfDigits(num)
    }
    fun sumOfDigits(num: Int): Int {
        if(num <= 9) {
           return num
        }
       var num = num % 10 + sumOfDigits(num/10)
       return sumOfDigits(num)
    }
}