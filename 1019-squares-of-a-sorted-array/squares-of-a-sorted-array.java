class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length-1,leftProduct = 0, rightProduct = 0, pos = nums.length-1;
        int[] res = new int[nums.length];
        while(left <= right){
            leftProduct = nums[left] * nums[left];
            rightProduct = nums[right] * nums[right];
            if(leftProduct < rightProduct){
                res[pos--] = rightProduct;
                right--;
            }else{
                res[pos--] = leftProduct;
                left++;
            }
        }
        return res;
    }
}