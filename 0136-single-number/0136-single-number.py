class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        value = 0
        for i in nums:
            value = value ^ i
        return value  
