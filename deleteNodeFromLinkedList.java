public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public void deleteNode(ListNode node) {
        if(node == null || node.next == null)
            return;
            
        ListNode temp = node.next.next;
        node.val = node.next.val;
        node.next = temp;
    }
}
