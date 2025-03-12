class Solution {
    public int maximumCount(int[] nums) {
         int neg = findFirstNegative(nums);
        int pos = nums.length - fintFirstPositive(nums);
        return Math.max(neg,pos);
    }
    static int findFirstNegative(int[] nums){
        int left = 0, right = nums.length-1, mid = 0;
        while(left<=right){
            mid = left + (right - left)/2;
            if(nums[mid]<0){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return left;
    }

    static int fintFirstPositive(int[] nums){
        int left = 0, right = nums.length-1, mid = 0;
        while(left<=right){
            mid = left + (right-left)/2;
            if(nums[mid]>0){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}