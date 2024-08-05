class Solution {
    fun minMovesToSeat(seats: IntArray, students: IntArray): Int {
        var result = 0
        seats.sort()
        students.sort()

        for (i in seats.indices){
            result += abs(seats[i] - students[i])
        }

        return result 
    }
}