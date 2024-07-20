class Solution:
    def maxDepth(self, s: str) -> int:
        max_depth = 0
        curr_depth = 0

        for i in s:
            if i == '(':
                curr_depth += 1
                max_depth = max(max_depth, curr_depth)
            elif i == ')':
                curr_depth -= 1

        return max_depth
        