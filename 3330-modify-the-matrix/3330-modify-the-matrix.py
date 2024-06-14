class Solution:
    def modifiedMatrix(self, matrix: List[List[int]]) -> List[List[int]]:
        row = len(matrix)
        col = len(matrix[0])
        answer = matrix.copy()

        for c in range(col):
            max_val = max(matrix[r][c] for r in range(row))
            for r in range(row):
                if matrix[r][c] == -1:
                    answer[r][c] = max_val
        return answer
        