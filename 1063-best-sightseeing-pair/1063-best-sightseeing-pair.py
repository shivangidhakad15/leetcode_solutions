class Solution:
    def maxScoreSightseeingPair(self, values: List[int]) -> int:
        score = 0
        prev = values[0]
        for j in range(1, len(values)):
            score = max(score, prev + values[j] - j)
            prev = max(prev, values[j] + j)
        return score
