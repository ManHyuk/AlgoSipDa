/**
* The read4 API is defined in the parent class Reader4.
* fun read4(buf4:CharArray): Int {}
*/

class Solution:Reader4() {
    /**
      * @param buf Destination buffer
      * @param n Number of characters to read
      * @return The number of actual characters read
      */
    override fun read(buf:CharArray, n:Int): Int {
        val buf4 = CharArray(4)
        var fours = n / 4
        var ones = n % 4

        for (i in 0..fours - 1) {
            val res = read4(buf4)
            for (j in 0..minOf(res, 4) - 1) {
                buf[i * 4 + j] = buf4[j]
            }
            if (res < 4) {
                return i * 4 + res
            }
        }
        
        if (ones > 0) {
            val res = read4(buf4)
            for (i in 0..minOf(res, ones) - 1) {
                buf[fours * 4 + i] = buf4[i]
            }
            if (res < ones) {
                return fours * 4 + res
            }
        }

        return n
    }
}