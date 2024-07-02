class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int num[] = new int[1001];
        List<Integer> res = new ArrayList<>();
        for(int i : nums1)
        {
            num[i]++;
        }
        for(int i : nums2)
        {
            if(num[i]>0)
            {
                res.add(i);
                num[i]--;
            }
        }
        int result[] = new int[res.size()];
        for(int i=0;i<res.size();i++)
        {
            result[i] = res.get(i);
        }
        return result;
    }
}