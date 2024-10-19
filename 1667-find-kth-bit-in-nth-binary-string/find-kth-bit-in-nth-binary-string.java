class Solution {
    public char findKthBit(int n, int k) {
        String[] s = new String[n];
        s[0] = "0";
        for(int i=1;i<n;i++){
            s[i] = s[i-1] + "1" + invertAndReverse(s[i-1]);
        }
        return s[n-1].charAt(k-1);

    }
    public String invertAndReverse(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0') {
                result.append('1');
            } else {
                result.append('0');
            }
        }
        result.reverse();
        return result.toString();
    }
}