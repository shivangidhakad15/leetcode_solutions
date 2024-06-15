class Solution:
    def luckyNumbers (self, matrix: List[List[int]]) -> List[int]:
        row = len(matrix)
        col = len(matrix[0])

        val = []
        for r in range(row):
            min_val = min(matrix[r])
            val.append(min_val)

        ans = []
        for c in range(col):
            max_val = max(matrix[r][c] for r in range(row))

            if max_val in val:
                ans.append(max_val)
        return ans

        