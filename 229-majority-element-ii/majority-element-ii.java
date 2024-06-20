class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> t = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>nums.length/3)
            {
                t.add(entry.getKey());
            }
        }
        return t;
    }
}