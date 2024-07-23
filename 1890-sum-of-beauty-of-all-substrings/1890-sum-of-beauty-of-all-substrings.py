class Solution:
    def beautySum(self, s: str) -> int:
        res = 0
        for i in range(len(s)):
            count = defaultdict(int)
            for j in range(i, len(s)):
                count[s[j]] += 1
                minF = min(count.values())
                maxF = max(count.values())
                res += (maxF - minF)
        return res
        