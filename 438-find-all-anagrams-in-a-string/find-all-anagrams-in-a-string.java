class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> result = new ArrayList<>();
        //checking edge case
        if(s==null || p == null || s.length()<p.length()){
            return result;
        }

        int pLen = p.length();
        int[] pFreq = new int[26], windowFreq = new int[26];
        for(char ch : p.toCharArray()){
            pFreq[ch-'a']++;
        }
        //sliding window
        for(int i=0;i<s.length();i++){
            //add current character
            windowFreq[s.charAt(i)-'a']++;
            // removing the left most character
            if(i>=pLen){
                windowFreq[s.charAt(i-pLen)-'a']--;
            }
            if(i>=pLen-1 && Arrays.equals(pFreq,windowFreq)){
                result.add(i-pLen+1);
            }
        }
        return result;
        
    }
}