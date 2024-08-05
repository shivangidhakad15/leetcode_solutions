class Solution:
    def validPalindrome(self, s: str) -> bool:
        left = 0
        right = len(s) - 1

        while left < right:
            if s[left] != s[right]:
                del_left = s[left + 1 : right + 1]
                del_right = s[left : right]

                return (del_left == del_left[::-1] or del_right == del_right[::-1])
            left += 1
            right -= 1
                
        return True



        