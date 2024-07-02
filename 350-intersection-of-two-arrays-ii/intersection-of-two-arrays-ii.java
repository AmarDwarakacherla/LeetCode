class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> freq = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            freq.put(nums1[i],freq.getOrDefault(nums1[i],0)+1);
        }
        for (int num : nums2) {
            if (freq.containsKey(num) && freq.get(num) > 0) {
                res.add(num);
                freq.put(num, freq.get(num) - 1);
            }
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;   
    }
}