class Solution {
    fun canAttendMeetings(intervals: Array<IntArray>): Boolean {
        val sortedIntervals = intervals.sortedBy{it[0]}

        for(i in 0 until sortedIntervals.size - 1) {
            if(sortedIntervals[i][1] > sortedIntervals[i+1][0]) {
                return false
            }
        }

        return true
    }
}