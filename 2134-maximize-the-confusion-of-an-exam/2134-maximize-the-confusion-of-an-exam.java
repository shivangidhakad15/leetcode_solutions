class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int countT = 0; 
        int countF = 0; 
        int res = 0;
        
        for(int i = 0, j = 0; j < answerKey.length(); j++) {
            if(answerKey.charAt(j) == 'T') 
                countT++;
            else
                countF++;
            
            while(Math.min(countT, countF) > k) {
                if(answerKey.charAt(i++) == 'T') 
                    countT--;
                else
                    countF--;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}