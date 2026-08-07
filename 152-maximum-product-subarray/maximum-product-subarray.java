class Solution {
    public int maxProduct(int[] nums) {
       int maxProduct = nums[0], minProduct = nums[0], max = nums[0];
        for(int i=1;i<nums.length;i++){
            int preMax = maxProduct;
            int preMin = minProduct;
            maxProduct = Math.max(nums[i],Math.max(preMax*nums[i], preMin*nums[i]));
            minProduct = Math.min(nums[i], Math.min(nums[i]*preMax, nums[i]*preMin));

            max= Math.max(max,maxProduct);
        }
        return max;
    }
}