class Solution {
    fun numberCount(a: Int, b: Int) = (a..b).fold(0) 
        { acc, i -> if (i.hasUniqueDigits()) acc + 1 else acc }

    fun Int.hasUniqueDigits(): Boolean {
        val string = this.toString()
        return string.toSet().size == string.length
    }
}