class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder result = new StringBuilder();
        int[] counts = {a, b, c};
        char[] chars = {'a', 'b', 'c'};
        while (true) {
            int maxIndex = -1;
            int maxCount = 0;
            for (int i = 0; i < 3; i++) {
                if (counts[i] > maxCount && (result.length() < 2 || result.charAt(result.length() - 1) != chars[i] || result.charAt(result.length() - 2) != chars[i])) {
                    maxCount = counts[i];
                    maxIndex = i;
                }
            }
            if (maxIndex == -1) break;
            result.append(chars[maxIndex]);
            counts[maxIndex]--;
        }
        
        return result.toString();
    }
}