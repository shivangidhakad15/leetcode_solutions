class Solution:
    def findGCD(self, nums: List[int]) -> int:
        a = min(nums)
        b = max(nums)

        if b == 0:
            return a
        else:
            return gcd(b, a % b)

        