class Solution:
    def getLucky(self, s: str, k: int) -> int:
        res = ""
        for i in s:
            num = ord(i)-96
            res += str(num)
        for _ in range(k):
            sum = 0
            for i in res:
                sum += int(i)
            res = str(sum)
        return sum

            
        

        


        