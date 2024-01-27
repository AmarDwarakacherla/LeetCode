class Solution {
    public int minSteps(String s, String t) {
        int a[] = new int[26];
        int steps = 0;
        for(int i=0;i<t.length();i++)
        {
            a[s.charAt(i)-'a']++;
            a[t.charAt(i)-'a']--;
        }
        for(int num: a)
        {
            if(num>0)
                steps+=num;
        }
        return steps;
        
    }
}