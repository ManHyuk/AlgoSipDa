class Solution {
    fun bitwiseComplement(n: Int): Int {
        var m = n 
        var mask = 0
        if(m == 0) return 1
        while(m != 0){
            mask = (mask shl 1) or 1
            m = m shr 1
        }

        val ans = n.inv() and mask
        return ans
    }
}