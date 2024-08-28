class Solution {
    public int maximumDifference(int[] nums) {
        int minNum = nums[0];
        int maxDiff = -1;
        for(int i=1; i<nums.length;i++)
        {
            if(nums[i]>minNum)
            {
                maxDiff = Math.max(maxDiff, nums[i]-minNum);
            }
            else
            {
                minNum = nums[i];
            }
        }
        return maxDiff;
        
    }
}