class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        seen = set([s for s in arr if arr.count(s) > 1])
        cnt = 0
        
        for i in arr:
            if i in seen:
                continue
            cnt += 1

            if cnt == k:
                return i
        
        return ""