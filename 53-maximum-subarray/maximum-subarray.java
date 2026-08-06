class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i : nums){
            sum = Math.max(sum+i,i);
            max = Math.max(sum,max);
        }
        return max;

        
    }
}