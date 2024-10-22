class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        count = Counter(nums)
        freq = defaultdict(list)
        for i, n in count.items():
            freq[n].append(i)
        sorted_freq = sorted(list(freq.items()))

        res = []
        for fr, num in sorted_freq:
            for each in sorted(num, reverse=True):
                for i in range(fr):
                    res.append(each)
        
        return res

