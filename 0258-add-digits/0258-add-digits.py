class Solution:
    def addDigits(self, num: int) -> int:
        while num > 9:
            arr = [int(x) for x in str(num)]
            num = sum(arr)
        return num