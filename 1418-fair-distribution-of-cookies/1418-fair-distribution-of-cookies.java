class Solution {
    int ans;
    int count[];
    public int distributeCookies(int[] cookies, int k) {
        ans = Integer.MAX_VALUE;
        count = new int[k];
        cookieBackTrack(0,cookies,k);
        return ans;
    }

    public void cookieBackTrack(int cookie, int cookies[], int k){
        if(cookie == cookies.length){
            int max = 0;
            for(int i=0;i<k;i++){
                max = Math.max(max,count[i]);
            }
            ans = Math.min(ans,max);
            return ;
        }
        for(int i=0;i<k;i++){
            count[i]+=cookies[cookie];
            cookieBackTrack(cookie+1,cookies,k);
            count[i]-=cookies[cookie];
        }
    }
}