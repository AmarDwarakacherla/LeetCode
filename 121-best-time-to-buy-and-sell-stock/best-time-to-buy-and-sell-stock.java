class Solution {
    public int maxProfit(int[] prices) {
        int buying = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        for(int i : prices){
            if(i < buying) buying = i;
            if(profit < i-buying) profit = i- buying;
        }
        return profit;
    }
}