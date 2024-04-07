class Solution {
    fun countBits(n: Int): IntArray {
        val ans = mutableListOf<Int>()
        for (i in 0..n) {
            val r = Integer.toBinaryString(i)
            ans.add(r.count { it == '1' } )
        }
        
        return ans.toIntArray() 
    }
}