class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        rank_map = {}
        copy_arr = sorted(arr)

        rank = 1
        for i in copy_arr:
            if i not in rank_map:
                rank_map[i] = rank
                rank += 1

        return [rank_map[i] for i in arr] 