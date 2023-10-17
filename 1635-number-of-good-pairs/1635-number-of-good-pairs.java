class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for(int n : nums){
            if(hm.containsKey(n)){
                count += hm.get(n);
            }
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }
        return count;
    }
}