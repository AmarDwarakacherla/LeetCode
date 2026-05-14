class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length-1;;
        Set<Integer> seen = new HashSet<>();
        boolean dup = false;
        for(int num : nums)
        {
            if(num<1 || num>n)   return false;
            if(seen.contains(num)){
                if(num==n && !dup)
                    dup = true;
                else
                    return false;
            }
            seen.add(num);
        }
        return dup && seen.size() == n;
    }
}