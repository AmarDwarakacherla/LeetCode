class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] t = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = nums[i] * nums[i];
        }
        int start = 0, end = nums.length-1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[start]<nums[end])
            {
                t[i] = nums[end];
                end--;
            }
            // else if(nums[start]>nums[end])
            else {
                t[i] = nums[start];
                start++;
            }
        }
        return t;
        
    }
}