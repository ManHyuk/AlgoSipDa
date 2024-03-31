/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        val map1 = hashSetOf<ListNode?>()
        var nodeA = headA
        var nodeB = headB
        while (nodeA!= null || nodeB != null){
            if(!map1.add(nodeA) && nodeA!=null) return nodeA
            if(!map1.add(nodeB) && nodeB!=null) return nodeB
            nodeA = nodeA?.next
            nodeB = nodeB?.next
        }
        return null       
    }
}