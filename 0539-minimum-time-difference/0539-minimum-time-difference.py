class Solution:
    def findMinDifference(self, timePoints: List[str]) -> int:
        mins = []
        for t in timePoints:
            h, m = map(int, t.split(':'))
            minutes = h * 60 + m
            mins.append(minutes)

        mins.sort()
        res = float('inf')
        for i in range(1, len(mins)):
            res = min(mins[i] - mins[i-1], res)

        return min(res, 1440 + mins[0] - mins[-1])