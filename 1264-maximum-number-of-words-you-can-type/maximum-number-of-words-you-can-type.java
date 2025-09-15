class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.trim().split(" ");
        System.out.println(Arrays.toString(words));
        int count = 0;
        for(String str : words){
            boolean contains = true;
            for(char ch : brokenLetters.toCharArray()){
                if(str.indexOf(ch) != -1){
                    contains = false;
                    break;
                }
            }
            if(contains) count++;
        }
        return count;   
    }
}