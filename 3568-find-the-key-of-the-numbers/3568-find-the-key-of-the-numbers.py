class Solution:
    def generateKey(self, num1: int, num2: int, num3: int) -> int:
        str_num1 = f"{num1:04}"
        str_num2 = f"{num2:04}"
        str_num3 = f"{num3:04}"
    
        key = ""
        for i in range(4):
            min_digit = min(str_num1[i], str_num2[i], str_num3[i])
            key += min_digit
        
        return int(key)