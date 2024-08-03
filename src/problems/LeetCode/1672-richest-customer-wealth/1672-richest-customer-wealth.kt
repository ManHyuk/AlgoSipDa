class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var maxWealth = 0
        accounts.forEach { 
            if (it.sum() > maxWealth)
                maxWealth = it.sum()
        }
        return maxWealth
    }
}