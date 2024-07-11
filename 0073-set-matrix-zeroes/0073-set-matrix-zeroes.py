class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        ROWS, COLS = len(matrix), len(matrix[0])
        rowZero = False

        for r in range(ROWS):
            for c in range(COLS):
                if matrix[r][c] == 0:
                    matrix[0][c] = 0
                    if r > 0:
                        matrix[r][0] = 0
                    else:
                        rowZero = True

        for r in range(1, ROWS):
            for c in range(1, COLS):
                if matrix[0][c] == 0 or matrix[r][0] == 0:
                    matrix[r][c] = 0

        if matrix[0][0] == 0:
            for r in range(ROWS):
                matrix[r][0] = 0

        if rowZero:
            for c in range(COLS):
                matrix[0][c] = 0

        # row = [1] * len(matrix)
        # col = [1] * len(matrix[0])

        # for r in range(len(matrix)):
        #     for c in range(len(matrix[0])):
        #         if matrix[r][c] == 0:
        #             row[r] = 0
        #             col[c] = 0
        
        # for r in range(len(matrix)):
        #     for c in range(len(matrix[0])):
        #         if row[r] == 0 or col[c] == 0:
        #             matrix[r][c] = 0

        """
        Do not return anything, modify matrix in-place instead.
        """
        