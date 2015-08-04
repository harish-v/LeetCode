struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* list = head;
        ListNode* prev = head;
        
        if(n == 1 && list->next == NULL)
            return NULL;
            
        while(list != NULL){
            list = list->next;
            if(0 == --n)
                break;
        }
        
        if(list == NULL)
            return head->next;
        
        while(list != NULL && list->next != NULL){
            head = head->next;
            list = list->next;
        }
        
        head->next = head->next->next;
        return prev;
    }
};
