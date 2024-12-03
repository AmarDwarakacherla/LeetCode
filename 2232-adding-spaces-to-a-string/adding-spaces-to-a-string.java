class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int t = 0;
        for(int i=0;i<s.length();i++){
            if (t < spaces.length && i == spaces[t]) {
                sb.append(" ");t++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}