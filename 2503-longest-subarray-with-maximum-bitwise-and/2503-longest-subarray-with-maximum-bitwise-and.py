class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        res = 0
        count = 0
        max_element = max(nums)

        for n in nums:
            if n == max_element:
                count += 1
            else:
                count = 0
            res = max(res, count)
        
        return res
