class Solution:
    def minimumSteps(self, s: str) -> int:
        zero = 0
        moves = 0

        for i in range(len(s)-1, -1, -1):
            if s[i] == '0':
                zero += 1
            else:
                moves += zero
        
        return moves