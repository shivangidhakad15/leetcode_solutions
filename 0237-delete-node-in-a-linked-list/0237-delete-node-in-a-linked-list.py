# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def deleteNode(self, node):
        first = node
        second = node.next
        third = second.next

        first.val = second.val
        first.next = third
        second.next = None


        """
        :type node: ListNode
        :rtype: void Do not return anything, modify node in-place instead.
        """
        