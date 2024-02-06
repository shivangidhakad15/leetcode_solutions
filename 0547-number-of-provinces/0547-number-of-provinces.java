class Solution {
  int len;
    public int findCircleNum(int[][] isConnected) {
        len = isConnected.length;
        int count = 0;
        boolean[] check = new boolean[len];
        for(int i = 0; i < len; i++){
            if(!check[i]){
                count++;
                helper(isConnected, check, i);
            }
        }
        return count;
    }
    void helper(int[][] isConnected, boolean[] check, int i){
        check[i] = true;
        for(int j = 0; j < len; j++){
            if(!check[j] && isConnected[i][j] == 1) helper(isConnected, check, j);
        }
  }
}