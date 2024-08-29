class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        lst = []
        for r in matrix:
            lst.extend(r)

        left, right = 0, len(lst)-1
        while left <= right:
            mid = (left + right) // 2
            if lst[mid] > target:
                right = mid - 1
            elif lst[mid] < target:
                left = mid + 1
            else:
                return True

        return False

