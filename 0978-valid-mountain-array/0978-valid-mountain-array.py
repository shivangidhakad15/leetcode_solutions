class Solution:
    def validMountainArray(self, arr: List[int]) -> bool:
        if len(arr) < 3:
            return False

        left, right = 1, len(arr) - 1
        while left < len(arr) and arr[left] > arr[left - 1]:
            left += 1
        while right > 0 and arr[right] < arr[right - 1]:
            right -= 1
        left -= 1

        if left == len(arr) - 1 or left == 0:
            return False
        
        return left == right
        