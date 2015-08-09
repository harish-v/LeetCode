public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }
    
    private ListNode add(ListNode l1, ListNode l2, int carry){
        ListNode result = null;
        
        if(l1 == null && l2 == null){
            if(carry > 0){
                result = new ListNode(carry);
            }
            return result;
        }
            
        int total = carry;
        ListNode l1Next = null, l2Next = null;
        
        if(l1 != null){
            total += l1.val;
            l1Next = l1.next;
        }
        
        if(l2 != null){
            total += l2.val;
            l2Next = l2.next;
        }
        
        result = new ListNode(total%10);
        carry = total/10;
        
        result.next = add(l1Next,l2Next, carry);
        return result;
    }
}
