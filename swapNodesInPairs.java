public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
            
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode prev = res, cur = head;
        
        while(cur !=null && cur.next != null){
            prev.next = cur.next;
            cur.next = cur.next.next;
            prev.next.next = cur;
            
            prev = cur;
            cur = cur.next;
        }
        
        return res.next;
    }
}
