class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] t = new int[nums.length];
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    if(t[j]+1>t[i])
                        t[i] = t[j]+1;
                }
            }
        }
        int max=0;
        for(int i=0;i<t.length;i++)
        {
            if(t[i]>max)
                max=t[i];
        }
        return max+1;
    }
}