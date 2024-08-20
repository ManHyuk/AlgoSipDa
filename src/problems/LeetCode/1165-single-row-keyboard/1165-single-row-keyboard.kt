class Solution {
    fun calculateTime(keyboard: String, word: String): Int {
        val keyboardMap = IntArray(26)

        for (i in keyboard.indices) {
            keyboardMap[keyboard[i] - 'a'] = i
        }

        var timeCount = 0
        var currentPointer = 0

        word.forEach {
            timeCount += abs(currentPointer - keyboardMap[it - 'a'])
            currentPointer = keyboardMap[it - 'a']
        }

        return timeCount
    }
}