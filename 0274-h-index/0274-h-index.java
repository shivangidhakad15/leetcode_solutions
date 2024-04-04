class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int res = 0;
        Arrays.sort(citations);
        for(int i=0; i<n; i++) {
            res = Math.max(res, Math.min(citations[i], n - i));
        }
        return res;
    }
}