class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] t = new int[2*nums.length];
        int x=0;
        int i=0;
        while(x<nums.length)
        {
            t[i]=nums[x];
            i++;
            x++;
            if(x==nums.length)
            {
                x=0;
            }
            if(i==t.length)
            {
                break;
            }
        }
        return t;
    }
}