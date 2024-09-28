class Solution:
    def minElement(self, nums: List[int]) -> int:
        min_value = float('inf')  # Initialize with a very large number
        for num in nums:
            digit_sum = 0
            while num > 0:
                digit_sum += num % 10
                num //= 10
            min_value = min(min_value, digit_sum)
        return min_value