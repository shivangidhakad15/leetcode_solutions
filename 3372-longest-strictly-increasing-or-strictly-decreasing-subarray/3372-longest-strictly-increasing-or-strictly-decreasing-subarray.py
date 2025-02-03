class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        incLen = decLen = 1
        max_length = 1

        for i in range(len(nums) - 1):
            if nums[i + 1] > nums[i]:
                incLen += 1
                decLen = 1
            elif nums[i + 1] < nums[i]:
                decLen += 1
                incLen = 1
            else:
                incLen = 1
                decLen = 1

            max_length = max(max_length, incLen, decLen) 
        
        return max_length