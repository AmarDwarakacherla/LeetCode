class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        freq.put(0,1);
        int prefixsum = 0;
        for(int i : nums){
            prefixsum += i;
            if(freq.containsKey(prefixsum-k)){
                count += freq.get(prefixsum-k);
            }
            freq.put(prefixsum,freq.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}