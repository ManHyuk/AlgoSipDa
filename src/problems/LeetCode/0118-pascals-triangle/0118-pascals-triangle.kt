class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val answer: MutableList<List<Int>> = mutableListOf()
        var lastList: List<Int> = listOf()

        for (i in 1..numRows) {
            val currentList = lastList.toMutableList()
            currentList.add(1)
            for (i in 1..currentList.lastIndex - 1) {
                currentList[i] = lastList[i] + lastList[i - 1]
            }
            lastList = currentList.toList()
            answer.add(currentList.toList())
        }

        return answer
    }
}