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
    fun countNodes(root: TreeNode?): Int {
        if(root == null) {
            return 0
        }
        
        if(root?.left == null && root?.right == null) {
            return 1
        }
        
        var count = 0
        count += root?.left?.let { node-> countNodes(node)} ?: 0
        count += root?.right?.let { node-> countNodes(node)} ?: 0
        
        return count + 1 
    }
}