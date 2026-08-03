class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        String res = sb.toString();
        int start = 0, end = res.length() - 1;
        while (start <= end) {
            if (res.charAt(start) != res.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}