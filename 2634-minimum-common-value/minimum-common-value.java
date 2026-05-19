class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       Set<Integer> seen = new HashSet<>();
        for(int num : nums1){
            seen.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums2){
            if(seen.contains(num)){
                list.add(num);
            }
        }
        return list.isEmpty() ? -1 : list.getFirst();
    }
}