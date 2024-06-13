class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        # if len(s) == len(goal):
        #     if goal in s+s:
        #         return True
        # return False

        return len(s) == len(goal) and goal in s+s
        