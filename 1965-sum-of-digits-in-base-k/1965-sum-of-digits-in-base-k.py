class Solution:
    def sumBase(self, n: int, k: int) -> int:
        res_sum = 0
        while n > 0:
            rem = n % k
            res_sum += rem
            n = n // k
        return res_sum
        