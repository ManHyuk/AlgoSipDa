class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var x = 0
        operations.forEach { if(it.contains("+")) x++ else x-- }
        return x
    }
}