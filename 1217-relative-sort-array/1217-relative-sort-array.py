class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        count = {}
        for num in arr1:
            if num in count:
                count[num] += 1
            else:
                count[num] = 1

        res = []
        for num in arr2:
            if num in count:
                res.extend([num] * count[num])
                del count[num]

        rem = sorted([num for num in count for _ in range(count[num])])
        res.extend(rem)

        return res
