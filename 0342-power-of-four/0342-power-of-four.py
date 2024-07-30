class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        if n < 1:
            return False
        
        while n % 4 == 0:
            n = n // 4
        if n == 1:
            return True
        return False
        