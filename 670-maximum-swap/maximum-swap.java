class Solution {
    public int maximumSwap(int num) {
        char[] s = Integer.toString(num).toCharArray();
        int[] last = new int[10];
        for (int i = 0; i < s.length; i++) {
            last[s[i] - '0'] = i;
        }
        for (int i = 0; i < s.length; i++) {
            for (int d = 9; d > s[i] - '0'; d--) {
                if (last[d] > i) {
                    char temp = s[i];
                    s[i] = s[last[d]];
                    s[last[d]] = temp;
                    return Integer.parseInt(new String(s));
                }
            }
        }
        return num;
    }
}