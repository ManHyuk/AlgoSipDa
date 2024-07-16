class Solution {
    fun defangIPaddr(address: String): String {
       // Defang the given address
    val defanged = StringBuilder()
    for (ch in address) {
        if (ch == '.') {
            defanged.append("[.]")
        } else {
            defanged.append(ch)
        }
    }
    return defanged.toString()

    }
}