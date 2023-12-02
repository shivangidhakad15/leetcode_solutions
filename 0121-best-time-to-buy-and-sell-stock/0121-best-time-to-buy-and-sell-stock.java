class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; 
        int currPrice = prices[0];

        for(int i=1; i<prices.length; i++){
            if(currPrice < prices[i])
                maxProfit = Math.max(maxProfit, prices[i]-currPrice);
            else
                currPrice = prices[i];
        }
        return maxProfit;
    }
}