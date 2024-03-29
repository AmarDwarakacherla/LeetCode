class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int n =  nums.length;
		int start = 0;
		int end = 0;
		int product = 1;
		int ans=0;
		while(end<n)
		{
			product *= nums[end];
			while(product>=k && start<=end)
			{
				product /= nums[start];
				start++;
			}
			ans += end-start+1;
			
			end++;
			
		}
		return ans;
	}
}