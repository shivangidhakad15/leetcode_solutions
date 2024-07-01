# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        slow = head
        fast = head 
 
        #find middle
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next

        #reverse second half 
        prev = None
        while slow:
            next = slow.next
            slow.next = prev
            prev = slow
            slow = next

        #check palindrome
        left = head
        right = prev
        while right:
            if left.val != right.val:
                return False
            left = left.next
            right = right.next
        return True









        # arr = []

        # while head:
        #     arr.append(head.val)
        #     head = head.next

        # left = 0
        # right = len(arr) - 1
        # while left <= right:
        #     if arr[left] != arr[right]:
        #         return False
        #     left += 1
        #     right -= 1
        # return True 
        

       
