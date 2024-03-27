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
    fun hasPathSum(root: TreeNode?, targetSum: Int) = sumNodes(root, targetSum, 0)

    fun sumNodes(root: TreeNode?, targetSum: Int, sum: Int): Boolean {
        return root?.let { 
            val iterSum = sum + root.`val`
            if(it.left == null && it.right == null) return targetSum == iterSum
            sumNodes(it.left, targetSum, iterSum) || 
                sumNodes(it.right, targetSum, iterSum)
        } ?: false
    }
}