class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        if(tickets[k]==0){
            return 0;
        }
        int time=0;
        for(int i=0;i<tickets.length;i++){
            if(tickets[k]==0){
                return time;
            }
            if(tickets[i]==0){
                continue;
            }
            if(tickets[i]!=0){
                tickets[i]--;
                time++;
            }
        }
        time+=timeRequiredToBuy(tickets,k);
        return time;
    }
}