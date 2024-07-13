class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        i = len(num1) - 1
        j = len(num2) - 1

        carry = 0
        res = []

        while i >= 0 or j >= 0:
            curr_i = int(num1[i]) if i >= 0 else 0
            curr_j = int(num2[j]) if j >= 0 else 0

            curr_sum = carry + curr_i + curr_j
            res.append(str(curr_sum % 10))
            carry = curr_sum // 10

            i -= 1
            j -= 1

        if carry:
            res.append(str(carry))

        return "".join(reversed(res))
        