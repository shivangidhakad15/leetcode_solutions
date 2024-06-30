# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        curr = head

        while curr:
            while curr.next and curr.val == curr.next.val:
                curr.next = curr.next.next
            curr = curr.next
        return head

        # seen = set()
        # dummy = ListNode()
        # dummy.next = head
        # prev = dummy
        # curr = head

        # while curr:
        #     if curr.val in seen:
        #         prev.next = curr.next
        #         curr = curr.next
        #     else:
        #         seen.add(curr.val)
        #         prev = curr
        #         curr = curr.next
        # return dummy.next



        