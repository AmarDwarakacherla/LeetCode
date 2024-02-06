class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String ana = isAna(s);
            List<String> list = map.getOrDefault(ana, new ArrayList<>());
            list.add(s);
            map.put(ana, list);
        }
        return new ArrayList<>(map.values());
        
    }
    public String isAna(String s){
        int[] count = new int[26];
        for(char c:s.toCharArray())
        {
            count[c-'a']++;
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<26;i++)
        {
            if(count[i]!=0)
            {
                str.append((char)('a'+i)).append(count[i]);
            }
        }
        return str.toString();
    }
}