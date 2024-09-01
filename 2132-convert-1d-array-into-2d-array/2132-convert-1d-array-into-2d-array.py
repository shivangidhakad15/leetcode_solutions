class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
        if len(original) != m * n:
            return []

        twoDArray = []
        for i in range(m):
            row = []
            for j in range(n):
                row.append(original[i * n + j])
            twoDArray.append(row)

        return twoDArray