1struct ListNode* reverseBetween(struct ListNode* head, int left, int right) {
2    if (!head || left == right) return head;
3
4    struct ListNode dummy;
5    dummy.next = head;
6    struct ListNode* prev = &dummy;
7
8    for (int i = 1; i < left; i++) {
9        prev = prev->next;
10    }
11
12    struct ListNode* curr = prev->next; 
13    for (int i = 0; i < right - left; i++) {
14        struct ListNode* nodeToMove = curr->next;
15        curr->next = nodeToMove->next;
16        nodeToMove->next = prev->next; 
17        prev->next = nodeToMove;
18    }
19    return dummy.next;
20}