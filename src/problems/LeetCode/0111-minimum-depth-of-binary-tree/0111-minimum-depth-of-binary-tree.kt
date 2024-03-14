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
    var res = ArrayList<Int>()

    // given a root, return min number of nodes from each branch
    fun minDepth(root: TreeNode?): Int {
        if (root == null)
            return 0
        rootToLeafList(root, 1)
        var min : Int = res.toList().min()!!
        return min
    }

    fun rootToLeafList(node : TreeNode?, depth : Int) {
        if(node!!.left == null && node!!.right == null) {
            res.add(depth)
        }
        
        if (node!!.left != null) {
            rootToLeafList(node.left, depth + 1)
        } 

        if (node!!.right != null) {
            rootToLeafList(node.right, depth + 1)
        }
    }
}