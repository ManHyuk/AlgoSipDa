class Solution {
    fun totalMoney(n: Int): Int {
        var remainingDays: Int = n
        var sum: Int = 0
        var mondayStart = 1
        
        while(remainingDays > 0) {
            val availableDays = min(remainingDays, 7)
            val minimalSavings = availableDays * mondayStart
            val additionalSavings = (0 until availableDays).sum()

            sum += minimalSavings + additionalSavings
            
            remainingDays -= 7
            ++mondayStart
        }
        return sum
    }
}