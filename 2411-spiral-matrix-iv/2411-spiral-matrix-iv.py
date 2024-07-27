# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def spiralMatrix(self, m: int, n: int, head: Optional[ListNode]) -> List[List[int]]:
        mat = [[-1] * n for _ in range(m)]
        left, right = 0, n - 1
        top, bottom = 0, m - 1
        curr = head

        while left <= right and top <= bottom:
            for c in range(left, right + 1):
                if curr:
                    mat[top][c] = curr.val
                    curr = curr.next
            top += 1

            for r in range(top, bottom + 1):
                if curr:
                    mat[r][right] = curr.val
                    curr = curr.next
            right -= 1

            for c in range(right, left - 1, -1):
                if curr:
                    mat[bottom][c] = curr.val
                    curr = curr.next
            bottom -= 1

            for r in range(bottom, top - 1, -1):
                if curr:
                    mat[r][left] = curr.val
                    curr = curr.next
            left += 1

        return mat



        