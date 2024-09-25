class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        res = []
        for i in range(len(nums)):
            if i == 0:
                res.append(nums[i])
            else:
                res.append(nums[i] + res[i-1])
        return res
            