class Solution:
    def reverse(self, x: int) -> int:
        MIN = -2147483647
        MAX = 2147483648

        reverse = 0
        while x:
            lastDigit = int(math.fmod(x, 10))
            x = int(x / 10)
            if (reverse > MAX // 10 or (reverse == MAX // 10 and lastDigit >= MAX % 10)):
                return 0
            if (reverse < MIN // 10 or (reverse == MIN // 10 and lastDigit <= MAX % 10)):
                return 0
            reverse = reverse * 10 + lastDigit
        return reverse

        