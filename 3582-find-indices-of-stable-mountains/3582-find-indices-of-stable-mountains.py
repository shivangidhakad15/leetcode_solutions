class Solution:
    def stableMountains(self, height: List[int], threshold: int) -> List[int]:
        stable_indices = []
    
        for i in range(1, len(height)):
            if height[i - 1] > threshold:
                stable_indices.append(i)
        
        return stable_indices