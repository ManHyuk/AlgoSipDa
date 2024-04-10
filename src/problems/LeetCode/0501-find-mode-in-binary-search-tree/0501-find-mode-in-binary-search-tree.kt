/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    val map = mutableMapOf<Int, Int>()

    fun findMode(root: TreeNode?): IntArray {
        root?.let {
            traverse(it)
        }
        val max = map.values.max()
        return map.entries
            .filter { it.value == max }
            .map { it.key }
            .toIntArray()
    }

    fun traverse(root: TreeNode) {
        map[root.`val`] = map.getOrDefault(root.`val`, 0) + 1
        root.left?.let {
            traverse(it)
        }
        root.right?.let {
            traverse(it)
        }
    }
}