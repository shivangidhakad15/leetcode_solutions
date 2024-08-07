class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left = 0
        right = len(numbers) - 1

        while left < right:
            twoSum = numbers[left] + numbers[right]

            if twoSum < target:
                left += 1
            elif twoSum > target:
                right -= 1
            elif twoSum == target:
                return [left + 1, right + 1]

        return [-1, -1]