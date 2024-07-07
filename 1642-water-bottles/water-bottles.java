class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles;
        while(numBottles >= numExchange)
        {
            int exchange = numBottles / numExchange;
            int empty = numBottles % numExchange;
            drink+=exchange;
            numBottles = exchange + empty;
        }
        return drink;
        
    }
}