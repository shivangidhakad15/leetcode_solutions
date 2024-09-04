class Solution:
    def reformat(self, s: str) -> str:
        digits = []
        letters = []

        for char in s:
            if char.isdigit():
                digits.append(char)
            elif char.isalpha():
                letters.append(char)
        
        res = ""
        if len(letters) == len(digits):
            while letters and digits:
                res += digits.pop()
                res += letters.pop()
        
        elif abs(len(digits) - len(letters)) == 1:
            if len(digits) > len(letters):
                res += digits.pop()
                while digits and letters:
                    res += letters.pop()
                    res += digits.pop()
            else:
                res += letters.pop()
                while digits and letters:
                    res += digits.pop()
                    res += letters.pop()

        else:
            return ""

        return res


        