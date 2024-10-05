class Solution {
    public int maxProfit(int[] prices) {
        int buying = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0;i<prices.length;i++)
        {
            buying = Math.min(buying,prices[i]);
            profit = Math.max(profit, prices[i]-buying);
        }
        return profit;
        
    }
}