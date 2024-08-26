class Solution:
    def sortString(self, s: str) -> str:
        s = list(s)
        res = []

        while len(s) > 0:
            smallest = sorted(set(s))
            for small in smallest:
                res.append(small)
                s.remove(small)

            largest = sorted(set(s), reverse = True)
            for large in largest:
                res.append(large)
                s.remove(large)

        return ''.join(res)
        