class Solution:
    def isPalindrome(self, x: int) -> bool:
        s = str(x)
        reverse = s[::-1]  
        if reverse == s:
            return True
        return False

        # if x < 0:
        #     return False
        # if x == 0:  # special case
        #     return True
        # if x % 10 == 0: # x mod 10 which is getting the last digit and the last digit is 0, then we also know that it's not a palindrome (ex: 30 is not a palindrome)
        #     return False

        # originalX = x
        # numReversed = 0
        # while x > 0:
        #     lastDigit = x % 10
        #     numReversed = numReversed * 10 + lastDigit
        #     x = x // 10
        # return numReversed == originalX
