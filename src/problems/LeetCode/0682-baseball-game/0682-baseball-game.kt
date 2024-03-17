class Solution {
    fun calPoints(operations: Array<String>): Int {
        val board = arrayListOf<Int>()
        for (op in operations) {
            when(op) {
                "C" -> board.removeLast()
                "D" -> board.add(board.last() * 2)
                "+" -> {
                    val last = board.removeLast()
                    val secondLast = board.last()
                    board.add(last)
                    board.add(last + secondLast)
                }
                else -> board.add(op.toInt())
            }
        }
        return board.sum() 
    }
}