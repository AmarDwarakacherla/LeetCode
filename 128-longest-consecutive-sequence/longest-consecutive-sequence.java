class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        for(int num : nums)
            set.add(num);
        for(int num : nums){
            if(!set.contains(num-1)){
                int currlongest = 1;
                int start = num;
                while(set.contains(start+1)){
                    currlongest++;
                    start++;
                }
                longest = Math.max(longest,currlongest);
            }
        }
        return longest;
    }
}