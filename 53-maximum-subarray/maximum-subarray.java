class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int cmax=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            cmax+=nums[i];
            if(cmax<nums[i])
                cmax=nums[i];
            if(max<cmax)
                max=cmax;
        }
        return max;
        
    }
}