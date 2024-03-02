class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1) return s; 
        int end=s.length()-1; 
        String ans="";

        char[] arr=s.toCharArray();
        int lsrt=(end)/2; 
        int rend=lsrt+1;  
        while(lsrt>=0 || rend<=end) { 
            if( lsrt>=0){
                ans= solve(s, lsrt , end ,ans , arr); 
                if((2*lsrt)+2 <= ans.length()) { 
                    lsrt=-1; 
                }                
                lsrt--;  
            }
            if(end<=end){
                ans= solve(s, rend , end ,ans,arr); 
                if((2*(end-rend))+2 <= ans.length()) {  
                    rend=end+1; 
                }
                rend++; 
            }

        }
        return ans;
    }

    public static String solve(String s, int mid,  int end, String ans,char[] arr){
            ans=checkPalindrome(s,end, mid ,mid , ans,arr);
            if(mid+1<=end && arr[mid]==arr[mid+1]){
                ans=checkPalindrome(s,end, mid ,mid+1 , ans,arr); 
            }

            return ans;        
    }

    public static String checkPalindrome(String s,int end,int leftPtr,int rightPtr,String ans, char[] arr){
        int flag=0;
        while(leftPtr>0 && rightPtr<end){
            leftPtr--;
            rightPtr++;
            if(arr[leftPtr]!=arr[rightPtr]){
                flag=1;
                break;
            }                
        }
        if(flag==0){
            if(ans.length()<(rightPtr-leftPtr+1)){  
                ans=s.substring(leftPtr,rightPtr+1);
            }
        }else{
            if(ans.length()<(rightPtr-leftPtr-1)){ 
                ans=s.substring(leftPtr+1,rightPtr); 
            }
        }
        return ans;
    }
}