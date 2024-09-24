class Solution:
    def isPossibleToSplit(self, nums: List[int]) -> bool:
        map = {}
        for n in nums:
            map[n] = map.get(n, 0) + 1
        for cnt in map.values():
            if cnt > 2:
                return False
        return True