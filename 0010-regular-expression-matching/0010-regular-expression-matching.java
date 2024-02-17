class Solution {
    public boolean isMatch(String s, String p) {
        int dp[][]=new int[s.length()+1][p.length()+1];
        return sol(s,p,dp);
    }
    public boolean sol(String s,String p,int[][] dp){
        int m=s.length(),n=p.length();
        if(n==0) return m==0;
        if(dp[m][n]!=0) return dp[m][n]==1;
        boolean f=(s.length()>0 && (s.charAt(0)==p.charAt(0) || p.charAt(0)=='.'));
        boolean ans=false;
        if(n>1 && p.charAt(1)=='*'){
            ans=(sol(s,p.substring(2),dp) || (f && sol(s.substring(1),p,dp)));
        }else{
            ans=(f && sol(s.substring(1),p.substring(1),dp));
        }
        if(ans) dp[m][n]=1;
        else dp[m][n]=-1;
        return ans;
    }
}