class Solution {
    fun numberToWords(num: Int): String {
        if (num == 0) return "Zero"

        val lessThan20 = arrayOf(
            "", 
            "One", 
            "Two", 
            "Three", 
            "Four", 
            "Five", 
            "Six", 
            "Seven", 
            "Eight", 
            "Nine", 
            "Ten",
            "Eleven", 
            "Twelve", 
            "Thirteen", 
            "Fourteen", 
            "Fifteen", 
            "Sixteen", 
            "Seventeen", 
            "Eighteen", 
            "Nineteen"
            )
            val tens = arrayOf("", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety")
            val thousands = arrayOf("", "Thousand", "Million", "Billion")

            fun helper(num: Int): String = 
            when {
                num == 0 -> ""
                num < 20 -> lessThan20[num]
                num < 100 -> tens[num/10]+" "+helper(num%10)
                else -> lessThan20[num / 100] + " Hundred " + helper(num % 100)
            }
            .trim()

            return generateSequence(Pair(num, 0)){ (n, i) -> Pair(n / 1000, i + 1) }
                .takeWhile { it.first > 0 }
                .map { (n, i) -> if (n % 1000 != 0) helper(n % 1000) + " " + thousands[i] else "" }
                .filter { it.isNotEmpty() }
                .toList()
                .asReversed()
                .joinToString(" ")
                .trim()
    }
}