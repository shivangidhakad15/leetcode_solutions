class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        nums = []
        for i in range(n):
            nums.append(start + 2 * i)
        res = 0
        for num in nums:
            res ^= num
        
        return res
