class Solution:
    def minimizedStringLength(self, s: str) -> int:
        res = len(set(s))
        return res