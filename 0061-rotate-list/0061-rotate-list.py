# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if not head:
            return head
        
        tail = head
        len = 1
        while tail.next:
            tail = tail.next
            len += 1
        k = k % len
        tail.next = head

        temp = head
        for _ in range(len - k - 1):
            temp = temp.next
        res = temp.next
        temp.next = None

        return res