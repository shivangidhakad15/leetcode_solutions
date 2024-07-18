class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.split()
        reverse = s[::-1]
        return " ".join(reverse)


        