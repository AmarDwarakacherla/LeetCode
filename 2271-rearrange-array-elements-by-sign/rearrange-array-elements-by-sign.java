class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i: nums)
        {
            if(i>0)
            {
                pos.add(i);
            }
            else
            {
                neg.add(i);
            }
        }
        int x=0;
        int ind1=0,ind2=0;
        while(ind2<nums.length/2)
        {
            nums[x++]=pos.get(ind1);
            nums[x++]=neg.get(ind2);
            ind1++;
            ind2++;
            
            
        }
        return nums;        
    }
}