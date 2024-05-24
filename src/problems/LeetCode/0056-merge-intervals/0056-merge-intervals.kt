class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy{it[0]}
        var start = intervals[0][0]
        var end = intervals[0][1]
        val ans = mutableListOf<IntArray>()

        for (i in 1 until intervals.size){
            var curstart = intervals[i][0]
            var curend = intervals[i][1]

            if (end >= curstart){
                end = maxOf(end, curend)
            } else {
                ans.add(intArrayOf(start, end))
                start = curstart
                end = curend
            }
        }
        ans.add(intArrayOf(start, end))
        return ans.toTypedArray()
        
    }
}