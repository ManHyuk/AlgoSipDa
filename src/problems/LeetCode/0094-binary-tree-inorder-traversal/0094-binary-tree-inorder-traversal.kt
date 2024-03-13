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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        root?.traverse(result)
        return result
    }

    private fun TreeNode.traverse(list: MutableList<Int>) {
        left?.traverse(list)
        list += `val`
        right?.traverse(list)
    }
}