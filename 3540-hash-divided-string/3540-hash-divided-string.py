class Solution:
    def stringHash(self, s: str, k: int) -> str:
        n = len(s)
        result = ""
        
        for i in range(0, n, k):
            substring = s[i:i+k]
            sum_hash = sum(ord(char) - ord('a') for char in substring)
            hashedChar = sum_hash % 26
            result += chr(hashedChar + ord('a'))
        
        return result
