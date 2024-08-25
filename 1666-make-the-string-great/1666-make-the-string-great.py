class Solution:
    def makeGood(self, s: str) -> str:
        res = []
        
        for c in s:
            if res and abs(ord(res[-1]) - ord(c)) == 32:
                res.pop()
            else:
                res.append(c)

        return "".join(res) 