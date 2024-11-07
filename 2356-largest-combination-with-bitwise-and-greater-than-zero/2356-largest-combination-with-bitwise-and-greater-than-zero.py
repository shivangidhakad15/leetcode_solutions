class Solution:
    def largestCombination(self, candidates: List[int]) -> int:
        max_cnt = 0
        for i in range(32):
            cnt = 0
            for num in candidates:
                if (num & (1 << i)) != 0:
                    cnt += 1
            max_cnt = max(max_cnt, cnt)
        return max_cnt