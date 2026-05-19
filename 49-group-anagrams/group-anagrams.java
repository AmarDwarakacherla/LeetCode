class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
    Map<String,Integer> map  = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(String str : arr){
            String key = isAna(str);
            if(!map.containsKey(key)){
                map.put(key,res.size());
                res.add(new ArrayList<>());
            }
            res.get(map.get(key)).add(str);
        }
        return res;

    }
    public String isAna(String s){
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            sb.append(freq[i]).append("#");
        }
        return sb.toString();
    }
}