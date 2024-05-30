class Solution {
    fun validWordAbbreviation(word: String, abbr: String): Boolean {
        var pointer = 0
        var curNum = 0

        for (c in abbr) {

            when {

                c.isDigit() -> {
                    if (curNum == 0 && c.digitToInt() == 0) return false

                    curNum = curNum * 10
                    curNum += c.digitToInt()
                }

                else -> {
                    pointer += curNum                    
                    curNum = 0

                    if (word.length <= pointer || pointer < 0 || word[pointer] != c) return false
                    pointer++
                }
            }
        }

        if (curNum > 0) {
            pointer += curNum
        }
        
        if(word.length != pointer) return false
        

        return true
    }
}