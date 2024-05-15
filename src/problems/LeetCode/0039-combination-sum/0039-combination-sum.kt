class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()

        val combination = mutableListOf<Int>()

        fun dfs(i: Int, sum: Int) {
            if (sum == target) {
                result.add(combination.toList())
                return
            }

            if (sum > target || i >= candidates.size) {
                return 
            }

            // using the current number
            combination.add(candidates[i])
            dfs(i, sum + candidates[i])
            combination.removeLast()

            // not using the current number
            dfs(i + 1, sum)        
        }

        dfs(0, 0)

        return result
    }
}