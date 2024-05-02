class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
		ArrayList<Integer> res = new ArrayList<>();
		res.add(-1);
		for(int i=0;i<nums.length;i++)
		{
			if(set.contains(nums[i]*-1))
				res.add(Math.abs(nums[i]));
			else
				set.add(nums[i]);
				
		}
		Collections.sort(res);
        return res.get(res.size()-1);
        
    }
}