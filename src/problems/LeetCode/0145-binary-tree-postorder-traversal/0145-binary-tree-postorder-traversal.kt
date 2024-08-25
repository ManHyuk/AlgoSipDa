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
    fun postorderTraversal(root: TreeNode?): List<Int> {
        return recursive(root, mutableListOf())
    }


    //---------------------------------------
    // Recursive
    private fun recursive(root: TreeNode?, list: MutableList<Int>): List<Int> {
        if (root == null) return list

        root.left?.let { recursive(it, list) }
        root.right?.let { recursive(it, list) }
        list.add(root.`val`)

        return list
    }
}