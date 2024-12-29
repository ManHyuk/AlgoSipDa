class Solution {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        val root = ListNode(0).apply { next = head }
        var node = root

        while (node.next != null) {
            if (node.next.`val` == `val`) {
                node.next = node.next?.next
                continue
            }
            node = node.next
        }

        return root.next
    }
}