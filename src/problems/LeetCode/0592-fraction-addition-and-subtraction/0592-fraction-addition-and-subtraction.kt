class Solution {
    class Fraction private constructor(private val numerator: Int, private val denominator: Int) {
        override fun toString() = "$numerator/$denominator"

        operator fun plus(o: Fraction): Fraction {
            val commonDenominator = lcm(denominator, o.denominator)
            val sumNumerator = numerator * (commonDenominator / denominator) + o.numerator * (commonDenominator / o.denominator)
            val nod = gcd(commonDenominator, abs(sumNumerator))
            return Fraction(sumNumerator / nod, if (sumNumerator == 0) 1 else commonDenominator / nod)
        }

        companion object {
            fun makeFraction(token: String): Fraction {
                val (numerator, denominator) = token.split('/').map(String::toInt)
                return Fraction(numerator, denominator)
            }

            private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

            private fun lcm(a: Int, b: Int) = a / gcd(a, b) * b
        }
    }

    fun String.tokenize(): List<String> {
        fun Char.isArithmeticOperation() = this == '+' || this == '-'
        
        var start = 0
        var end = 1
        val tokens = mutableListOf<String>()
        while (end <= length) {
            if (end == length || this[end].isArithmeticOperation()) {
                tokens += substring(start..<end)
                start = end
            }
            end++
        }
        return tokens
    }

    fun fractionAddition(expression: String): String {
        return expression
                .tokenize()
                .map(Fraction::makeFraction)
                .reduce { acc, next -> acc + next }
                .toString()
    }
}