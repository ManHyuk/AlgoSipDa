class Solution {
    fun generateParenthesis(n: Int): List<String> = solve(n, n)
    
    tailrec fun solve(left: Int, right: Int, value: String = "", result: List<String> = listOf()) : List<String> = 
    when {
        left == 0 && right == 0 -> result.plus(value)
        left == right -> solve(left-1, right, value+"(", result)
        left == 0 -> solve(left, right-1, value+")", result)
        else -> solve(left-1, right, value+"(", result).plus(solve(left, right-1, value+")", result))
    }
}