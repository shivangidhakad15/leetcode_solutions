class Solution:
    def getEncryptedString(self, s: str, k: int) -> str:
        while k > len(s):
            k -= len(s)
        return s[k : ] + s[ : k]

