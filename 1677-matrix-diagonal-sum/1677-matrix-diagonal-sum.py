class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        res = 0
        for i in range(len(mat)):
            res += mat[i][i] + mat[i][len(mat) - i -1] 
        if len(mat) % 2 == 1:
            res -= mat[len(mat) // 2][len(mat) // 2]
        return res
            
        