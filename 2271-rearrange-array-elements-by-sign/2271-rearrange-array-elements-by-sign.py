class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        pos_index = 0
        neg_index = 1
        res = [0] * len(nums)

        for n in nums:
            if n > 0:
                res[pos_index] = n
                pos_index += 2
            else:
                res[neg_index] = n
                neg_index += 2
        return res

        