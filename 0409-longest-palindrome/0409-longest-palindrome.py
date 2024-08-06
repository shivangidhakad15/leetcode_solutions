class Solution:
    def longestPalindrome(self, s: str) -> int:
        charSet = set()
        length = 0

        for c in s:
            if c in charSet:
                charSet.remove(c)
                length += 2
            else:
                charSet.add(c)
        
        if charSet:
            length += 1
        
        return length
        