class Solution:
    def getLucky(self, s: str, k: int) -> int:
        res = ""
        for i in s:
            num = ord(i)-96
            res += str(num)

        while k > 0:
            sum = 0
            for i in res:
                sum += int(i)
            res = str(sum)
            k -= 1
        return int(res)

            
        

        


        