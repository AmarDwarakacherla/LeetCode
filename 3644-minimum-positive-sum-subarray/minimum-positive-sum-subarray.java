class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
         int  min = Integer.MAX_VALUE, sum = 0, len = 0;
        for(int i=0;i<nums.size();i++){
            sum = 0;
            for(int j=i;j<nums.size();j++){
                sum += nums.get(j);
                len = j - i + 1;
                if(len>=l && len<=r && sum >0) {
                    min = Math.min(sum, min);
                }
            }
        }
        return min != Integer.MAX_VALUE ? min : -1;
    }
}