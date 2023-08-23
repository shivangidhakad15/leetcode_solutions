class Solution {
    public int distinctIntegers(int n) {
        if(n <= 2){
            return 1;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i % j == 1){
                    set.add(i);
                }
            }
        }
        return set.size();
    }
}