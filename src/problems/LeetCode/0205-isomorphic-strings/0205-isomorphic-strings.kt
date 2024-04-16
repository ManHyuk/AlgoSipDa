class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val map = mutableMapOf<Char, Char>()
        val used = mutableSetOf<Char>()

        for (i in 0 until s.length) {
            val c = s[i]
            val d = t[i]

            if(map.contains(c)) {
                if(map[c]!! != d) return false
            } else {
                if(used.contains(d)) return false
            }
            map[c] = d
            used.add(d)
        }

        return true
    }
}