class Solution {    
    fun convertToTitle(columnNumber: Int): String {
        val list = mutableListOf<Char>()
        var num = columnNumber
        while (num > 0) {
            var charNum = num % 26
            if(charNum == 0){
                charNum = 26
                num--
            }
            list.add((charNum + 64).toChar())
            num /= 26
        }

        return list.reversed().joinToString(separator = "")

    }


}