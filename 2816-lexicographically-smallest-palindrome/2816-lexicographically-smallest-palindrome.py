class Solution:
    def makeSmallestPalindrome(self, s: str) -> str:
        s = list(s)

        for c in range (len(s) // 2):
            if s[c] != s[len(s)-c-1]:  
                min_char = min(s[c], s[len(s)-c-1])
                s[c], s[len(s)-c-1] = min_char, min_char

        return ''.join(s)


        