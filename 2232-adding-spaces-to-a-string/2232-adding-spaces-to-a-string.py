class Solution:
    def addSpaces(self, s: str, spaces: List[int]) -> str:
        res = []
        j = 0
        n = len(spaces)

        for i, char in enumerate(s):
            if j < n and i == spaces[j]:
                res.append(" ")
                j += 1
            res.append(char)

        return "".join(res)