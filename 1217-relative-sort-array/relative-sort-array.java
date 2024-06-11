class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = 0;
        for(int i : arr1)
            max = Math.max(max,i);
        int t[] = new int[max + 1];

        for(int i=0;i<arr1.length;i++)
        {
            t[arr1[i]]++;
        }
        int[] res = new int[arr1.length];
        int j = 0;
        for(int i=0;i<arr2.length;i++)
        {
            int element = arr2[i];
            while(t[element]>0)
            {
                res[j] = element;
                t[element]--;
                j++;
            }
        }
        for(int i=0;i<max+1;i++)
        {
            while(t[i]>0)
            {
                res[j]=i;
                t[i]--;
                j++;
            }
        }
        return res;
        
        
    }
}