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
    fun preorderTraversal(root: TreeNode?): List<Int> {
        var list = mutableListOf<Int>()
        return preorderTraversalRec(root,list)
    }

    fun preorderTraversalRec(root:TreeNode?,list:MutableList<Int>):List<Int>{
        if(root==null)return list
        var nodeValue = root.`val`
        list.add(nodeValue)
        preorderTraversalRec(root.left,list)
        preorderTraversalRec(root.right,list)
        return list
    }
}