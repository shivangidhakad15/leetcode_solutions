class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> inter = new HashSet<>(); 

        for (int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++){
            if (set.contains(nums2[i])){
                inter.add(nums2[i]);
            }
        }
        int[] ans = new int[inter.size()];
        int index = 0;
        for (Integer i : inter){
            ans[index] = i;
            index++;
        }
        return ans;
    }
}