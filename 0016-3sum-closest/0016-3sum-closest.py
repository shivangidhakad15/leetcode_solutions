class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        closest_sum = sum(nums[:3])

        for i in range(len(nums) - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            left = i + 1
            right = len(nums) - 1

            while left < right:
                threeSum = nums[i] + nums[left] + nums[right] 

                if threeSum == target:
                    return threeSum
                elif abs(threeSum - target) < abs(closest_sum - target):
                    closest_sum = threeSum
                elif threeSum > target:
                    right -= 1
                elif threeSum < target:
                    left += 1


        return closest_sum
