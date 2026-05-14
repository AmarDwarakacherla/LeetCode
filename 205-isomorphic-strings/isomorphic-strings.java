class Solution {
    public boolean isIsomorphic(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if(!map1.containsKey(s1.charAt(i))){
                map1.put(s1.charAt(i), i);
            }
            if(!map2.containsKey(s2.charAt(i))) {
                map2.put(s2.charAt(i), i);
            }
            if(map1.get(s1.charAt(i)) != map2.get(s2.charAt(i))){
                return false;
            }
        }
        return true;
    }
}