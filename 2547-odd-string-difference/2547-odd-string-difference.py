class Solution:
    def oddString(self, words: List[str]) -> str:
        n = len(words)
        m = len(words[0])
        diff_arr = []

        for i in words:
            l = []
            for j in range(1, m):
                diff = ord(i[j]) - ord(i[j - 1])
                l.append(diff)
            diff_arr.append(l)

        for i in range(len(diff_arr)):
            if diff_arr.count(diff_arr[i]) == 1: 
                return words[i]

            
            
        