class Solution:
    def minGroups(self, intervals: List[List[int]]) -> int:
        start = sorted(i[0] for i in intervals)
        end = sorted(i[1] for i in intervals)
        end_ptr, res = 0, 0

        for s in start:
            if s > end[end_ptr]:
                end_ptr += 1
            else:
                res += 1
        
        return res