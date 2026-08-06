class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int prod = 1;
        for(int i=0;i<nums.length;i++){
            prod = 1;
            for(int j=i;j<nums.length;j++){
                prod *= nums[j];
                maxProduct = Math.max(maxProduct, prod);
            }
        }
        return maxProduct;
    }
}