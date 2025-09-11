class Solution {
    public String sortVowels(String s) {
      List<Character> vowels = new ArrayList<>();
        for(char c : s.toCharArray()){
            if("AEIOUaeiou".indexOf(c)!=-1)
                vowels.add(c);
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(vowels);
        int i = 0;
        for(char c : s.toCharArray()){
            if("AEIOUaeiou".indexOf(c)!=-1)
                sb.append(vowels.get(i++));
            else 
                sb.append(c);
        }
        return sb.toString();

    }
}