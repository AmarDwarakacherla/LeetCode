class Solution {
    
    public  int maxUniqueSplit(String s) {
        return helper(s, 0, new HashSet<>());
    }
    public int helper(String s, int start, Set<String> seen) {
        if (start == s.length()) {
            return 0; 
        }
        int maxSplits = 0;
        for (int end = start + 1; end <= s.length(); end++) {
            String substring = s.substring(start, end);
            if (!seen.contains(substring)) {
                seen.add(substring); 
                maxSplits = Math.max(maxSplits, 1 + helper(s, end, seen));
                seen.remove(substring); 
            }
        }
        return maxSplits;
    }
}