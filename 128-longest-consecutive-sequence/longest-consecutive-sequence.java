class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int max = 0, current = 0, count = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                current = num;
                count = 1;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}