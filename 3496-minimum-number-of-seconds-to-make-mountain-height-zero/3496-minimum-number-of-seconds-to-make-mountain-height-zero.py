class Solution:
    def minNumberOfSeconds(self, mountainHeight: int, workerTimes: List[int]) -> int:
        def canReduceHeightInTime(T):
            totalReducedHeight = 0
            for time in workerTimes:
                # We need to find the maximum x such that time * (1 + 2 + ... + x) <= T
                # This is equivalent to solving time * x * (x + 1) / 2 <= T
                # which becomes x^2 + x - 2T/time <= 0, a quadratic inequality
                low, high = 0, mountainHeight
                while low <= high:
                    mid = (low + high) // 2
                    if time * mid * (mid + 1) // 2 <= T:
                        low = mid + 1
                    else:
                        high = mid - 1
                totalReducedHeight += high
                if totalReducedHeight >= mountainHeight:
                    return True
            return totalReducedHeight >= mountainHeight

        # Binary search for minimum time
        left, right = 0, workerTimes[0] * mountainHeight * (mountainHeight + 1) // 2
        while left < right:
            mid = (left + right) // 2
            if canReduceHeightInTime(mid):
                right = mid
            else:
                left = mid + 1
        
        return left