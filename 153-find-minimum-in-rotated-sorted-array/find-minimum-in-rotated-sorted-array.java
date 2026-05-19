class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length-1;
        while(low < high){
            //current range is sorted, first element would be the min
            if(nums[low] < nums[high])  return nums[low];
            int mid = low + (high - low)/2;
            //min lies in right half
            if(nums[mid] > nums[high])
                low = mid + 1;
            // min lies in left half including the mid
            else
                high = mid;
        }
        // low == high points to min
        return nums[low];
    }
}