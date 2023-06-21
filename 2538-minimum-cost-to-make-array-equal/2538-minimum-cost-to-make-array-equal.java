class Solution {
    public long minCost(int[] nums, int[] cost) {
        int min=10000000, max=0;
        for(int i:nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        return cost(nums, cost, nums.length, binarySearch(nums, cost, nums.length, min, max));
    }
    
    private int binarySearch(int[] nums, int[] cost, int n, int left, int right) {
        while(left < right) {
            int mid = (left+right)/2;
            
            long cmid = cost(nums, cost, n, mid);
            long cmidminus1 = cost(nums, cost, n, mid-1);
            long cmidplus1 = cost(nums, cost, n, mid+1);

            if(cmid<=cmidminus1 && cmid<=cmidplus1) return mid;
            
            if(cmidminus1 < cmid) right = mid-1;
            else if(cmidplus1 < cmid) left = mid+1;
        }

        return left;
    }
    
    private long cost(int[] nums, int[] cost, int n, int val) {
        long c=0; 
        for(int i=0; i<n; ++i)
            c += (long)cost[i]*Math.abs(nums[i]-val);
        return c;
    }
}