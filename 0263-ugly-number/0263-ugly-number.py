class Solution:
    def isUgly(self, n: int) -> bool:
        f = [2, 3, 5]

        for i in f:
            while n > 1 and n % i == 0:
                n = n // i
        
        if n == 1:
            return True
        else:
            return False