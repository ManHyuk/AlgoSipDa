class Solution {
    fun fib(n: Int) = generateSequence(0 to 1) {
            it.second to it.first + it.second
    }.take(n).lastOrNull()?.second ?: n
}