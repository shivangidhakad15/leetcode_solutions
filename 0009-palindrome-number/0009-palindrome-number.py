class Solution:
    def isPalindrome(self, x: int) -> bool:
        s = str(x)
        reverse = s[::-1]  
        if reverse == s:
            return True
        return False