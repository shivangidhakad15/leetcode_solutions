class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        lst = list(s)

        for i in range(0, len(lst), k+k):
            lst[i : k+i] = reversed(lst[i : k+i])

        return ''.join(lst)