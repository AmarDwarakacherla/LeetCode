class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, curr = 0, prev = 0;
        int total = nums1.length+nums2.length;
        for(int c = 0; c <= total/2; c++){
            prev = curr;
            if(i<nums1.length && j<nums2.length){
                if(nums1[i] < nums2[j]){
                    curr = nums1[i++];
                }else{
                    curr = nums2[j++];
                }
            }else if(i < nums1.length){
                curr = nums1[i++];
            }else{
                curr = nums2[j++];
            }
        }
        if(total % 2 == 0){
            return (prev+curr)/2.0;
        }
        return curr;
    }
}