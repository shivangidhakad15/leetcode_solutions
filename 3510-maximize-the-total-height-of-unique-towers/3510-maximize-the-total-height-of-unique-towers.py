class Solution:
    def maximumTotalSum(self, maximumHeight: List[int]) -> int:
        maximumHeight.sort()
    
        n = len(maximumHeight)
        total_sum = 0
        current_height = maximumHeight[-1]  # Start with the largest possible height

        # Traverse from the last tower to the first
        for i in range(n - 1, -1, -1):
            if maximumHeight[i] < current_height:
                current_height = maximumHeight[i]
            # If the current height becomes 0 or negative, it's impossible to assign valid heights
            if current_height <= 0:
                return -1
            total_sum += current_height
            current_height -= 1  # Ensure the next tower has a different height

        return total_sum