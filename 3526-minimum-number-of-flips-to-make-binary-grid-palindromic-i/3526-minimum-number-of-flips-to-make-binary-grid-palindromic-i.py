class Solution:
    def minFlips(self, grid: List[List[int]]) -> int:
        m = len(grid)
        n = len(grid[0])

        def flips_for_palindromic_row(row):
            flips = 0
            for j in range(n // 2):
                if row[j] != row[n - j - 1]:
                    flips += 1
            return flips

        def flips_for_palindromic_column(col):
            flips = 0
            for i in range(m // 2):
                if grid[i][col] != grid[m - i - 1][col]:
                    flips += 1
            return flips

        row_flips = sum(flips_for_palindromic_row(grid[i]) for i in range(m))
        column_flips = sum(flips_for_palindromic_column(j) for j in range(n))

        return min(row_flips, column_flips) 