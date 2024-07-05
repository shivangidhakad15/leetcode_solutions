class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        res = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[res] = nums[i]
                res += 1
        while res < len(nums):
            nums[res] = 0
            res += 1
        

        """
        Do not return anything, modify nums in-place instead.
        """
        