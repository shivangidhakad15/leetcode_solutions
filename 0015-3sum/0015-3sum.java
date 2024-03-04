class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int st = i + 1;
            int en = nums.length - 1;
            while (st < en) {
                int sum = nums[i] + nums[st] + nums[en];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[st], nums[en]));
                    st++;
                    en--;
                    while (st < en && nums[st] == nums[st - 1]) {
                        st++;
                    }
                    while (st < en && nums[en] == nums[en + 1]) {
                        en--;
                    }
                } else if (sum < 0) {
                    st++;
                } else {
                    en--;
                }
            }
        }
        return result;
    }
}