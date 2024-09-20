class Solution:
    def shortestPalindrome(self, s: str) -> str:
        palindrome = s[::-1]
        if s == palindrome:
            return s
        
        for i in range(len(s)):
            if s[ : len(s)-i] == palindrome[i : ]:
                return palindrome[: i] + s
        
        return ""