class Solution {
    public int minOperations(int[] nums) {
        
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num: nums)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int ans=0;

        for(int num: freq.keySet())
        {
            int c=freq.get(num);
            if(c==1)
                return -1;
            ans=ans+c/3;
            if(c%3!=0)
                ans++;
        }
        return ans;
    }
}