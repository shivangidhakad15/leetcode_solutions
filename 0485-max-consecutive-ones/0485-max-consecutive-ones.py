class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max_ones = 0
        count = 0
        for i in nums:
            if i == 1:
                count += 1
                max_ones = max(max_ones, count)
            else:
                count = 0
        return max_ones
        
        