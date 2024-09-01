class Solution {
    fun toArray(root: Node?): IntArray {
        val result = mutableListOf<Int>()
        var current = root
        
        while (current != null) {
            result.add(current.`val`)
            current = current.next
        }
        
        return result.toIntArray()
    }
}   