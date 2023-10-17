class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while(n != 1){
            int curr = n;
            int sum = 0;
            while(curr != 0){
                int rem = curr % 10;
                sum += (rem * rem);
                curr = curr / 10;
            }
            if(hs.contains(sum)){
                return false;
            }
            n = sum;
            hs.add(n);
        }
        return true;
    }
}