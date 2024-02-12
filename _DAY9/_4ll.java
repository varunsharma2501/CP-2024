public enum _4ll {
    // bool isPalindrome(ListNode* head) {
    //     ListNode* slow = head, *fast = head, *prev = NULL;
    //     while(fast && fast->next){
    //     slow = slow->next;
    //     fast = fast->next->next;
    //     }
    //     while(slow){
    //     ListNode* temp = slow->next;
    //     slow->next = prev;
    //     prev = slow;
    //     slow = temp;
    //     }
    //     ListNode* ne = head;
    //     while(ne != NULL && prev != NULL){
    //     if(ne->val != prev->val) return 0;
    //     ne = ne->next;
    //     prev = prev->next;
    //     }
    //     return 1;
    //     }
}

https://leetcode.com/problems/reverse-nodes-in-k-group/