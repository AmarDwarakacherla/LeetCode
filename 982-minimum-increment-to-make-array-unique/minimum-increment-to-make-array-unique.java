class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int move = 0;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]<=nums[i-1])
            {
                int newvalue = nums[i-1] + 1;
                move += newvalue - nums[i];
                nums[i] = newvalue;
            }
        }
        return move;
        
    }
}