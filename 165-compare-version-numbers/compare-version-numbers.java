class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        for(int i=0;i<s1.length || i<s2.length;i++)
        {
            int num1 = i<s1.length ? Integer.parseInt(s1[i]) : 0;
            int num2 = i<s2.length ? Integer.parseInt(s2[i]) : 0;
            int compare = Integer.compare(num1,num2);
            if(compare!=0) return compare;
        }
        return 0;
        
    }
}