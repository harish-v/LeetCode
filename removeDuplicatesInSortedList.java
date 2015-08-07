public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
            
        ListNode prev = null;
        prev = head;
        ListNode temp = head.next;
        
        while(temp != null){
            if(prev.val != temp.val){
                prev.next = temp;
                prev = prev.next;
            }
            temp = temp.next;
        }
        
        prev.next = null;
        return head;
    }
}
