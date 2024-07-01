# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head
        prev_node = dummy
        curr_node = head

        while curr_node:
            if curr_node.val == val:
                prev_node.next = curr_node.next
            else:
                prev_node = curr_node 
            curr_node = curr_node.next
        return dummy.next


        