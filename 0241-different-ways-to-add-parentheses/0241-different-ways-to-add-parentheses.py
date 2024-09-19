class Solution:
    def diffWaysToCompute(self, expression: str) -> List[int]:
        ans = []
        for i in range(len(expression)):
            op = expression[i]
            if op == "+" or op == "-" or op == "*":
                str1 = expression[0:i]
                str2 = expression[i+1: ]
                s1 = self.diffWaysToCompute(str1)
                s2 = self.diffWaysToCompute(str2)
                for i in s1:
                    for j in s2:
                        if op == "+":
                            ans.append(int(i) + int(j))
                        if op == "-":
                            ans.append(int(i) - int(j))
                        if op == "*":
                            ans.append(int(i) * int(j))
        
        if len(ans) == 0:
            ans.append(int(expression))

        return ans