class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length == 0) return 0;
        int maxSum = nums[0], sum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                sum += nums[i];
            }
            else{
                sum = nums[i];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
        
    }
}