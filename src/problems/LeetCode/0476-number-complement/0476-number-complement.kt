class Solution {
    fun findComplement(num: Int): Int {
        var str = StringBuilder()

        for (d in num.toString(2)) 
            str.append(if (d == '1') '0' else '1')
        
        return str.toString().toInt(2)
    }
}