public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;
            
        ListNode slow = head, fast = head, prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(prev != null)
            prev.next = null;
        else
            head = null;
            
        ListNode rev = reverse(slow);
        
        while(head != null && rev != null){
            if(head.val != rev.val){
                return false;
            }
            
            head = head.next;
            rev = rev.next;
        }
        
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null, cur = head;
        
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        
        return prev;
    }
}
