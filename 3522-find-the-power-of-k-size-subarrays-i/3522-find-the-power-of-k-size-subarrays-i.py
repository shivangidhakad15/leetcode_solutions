class Solution:
    def resultsArray(self, nums: List[int], k: int) -> List[int]:
        results = []
        for i in range(len(nums) - k + 1):
            subarray = nums[i:i + k]
            is_consecutive = True
            
            for j in range(k - 1):
                if subarray[j + 1] != subarray[j] + 1:
                    is_consecutive = False
                    break
            
            if is_consecutive:
                results.append(max(subarray))
            else:
                results.append(-1)
        
        return results