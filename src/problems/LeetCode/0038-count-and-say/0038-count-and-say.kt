class Solution {
    fun countAndSay(n: Int): String {
        var str = ""
        for (i in 1..n) {
            if (i == 1) {
                str = "1"
            } else {
                str = toString(count(str))
            }
        }

        return str
    }

    private fun toString(list: List<List<Int>>): String {
        val sb = StringBuilder()

        for (subList in list) {
            sb.append(subList[0]).append(subList[1])
        }

        return sb.toString()
    }

    private fun count(s: String): List<List<Int>> {
        var counts = ArrayList<List<Int>>()
        var i = 0

        while (i < s.length) {
            var ch = s[i]
            var count = 0
            do {
                count++
                i++
            } while (i < s.length && ch == s[i])
            counts.add(listOf(count, Character.getNumericValue(ch)))
        }

        return counts
    }
}