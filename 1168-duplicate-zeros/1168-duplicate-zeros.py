class Solution:
    def duplicateZeros(self, arr: List[int]) -> None:
        """
        Do not return anything, modify arr in-place instead.
        """
        i = 0
        while i < len(arr):
            if arr[i] == 0:
                i += 1
                arr.insert(i, 0)
                arr.pop()
            i += 1
        return arr
