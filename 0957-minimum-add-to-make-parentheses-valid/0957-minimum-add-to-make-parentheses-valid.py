class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        left = 0
        right = 0

        for c in s:
            if c == '(':
                left += 1
            elif c == ')':
                if left > 0:
                    left -= 1
                else:
                    right += 1
        
        return left + right