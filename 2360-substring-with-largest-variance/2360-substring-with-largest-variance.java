class Solution {
    public int largestVariance(String s) {
        StringBuilder sb=new StringBuilder(s);
        int ans=0;
        HashMap <Character,Integer> freq=new HashMap<>();
        for(char c: s.toCharArray()){
            freq.put(c,1);
        }
        for(char ch1='a';ch1<='z';ch1++){
            for(char ch2='a';ch2<='z';ch2++){
                if(ch1==ch2 || freq.get(ch1)==null ||freq.get(ch2)==null)
                    continue;

            for(int rev=1;rev<=2;rev++){
                int count1=0;int count2=0;
                    for(char c: sb.toString().toCharArray()){
                        if(c==ch1){
                            count1++;
                        }else if(c==ch2){
                            count2++;
                        }
                        if(count1<count2){
                            count1=count2=0;
                        }
                        if(count1>0 && count2>0){
                            ans=Math.max(ans,count1-count2);
                        }
                    }
                    sb.reverse();

            }
                
            }
        }
        return ans;
    }
}