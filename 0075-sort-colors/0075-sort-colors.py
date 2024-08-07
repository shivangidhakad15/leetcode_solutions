class Solution:
    def sortColors(self, nums: List[int]) -> None:
        left, right = 0, len(nums) - 1
        i = 0

        def swap(i, j):
            nums[i], nums[j] = nums[j], nums[i]

        while i <= right:
            if nums[i] == 0:
                swap(left, i)
                left += 1

            elif nums[i] == 2:
                swap(i, right)
                right -= 1
                i -= 1
            i += 1
        """
        Do not return anything, modify nums in-place instead.
        """
        