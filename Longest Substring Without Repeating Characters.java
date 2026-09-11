class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int start = 0;
        
     
        java.util.HashMap<Character, Integer> charMap = new java.util.HashMap<>();
        
        for (int end = 0; end < n; end++) {
            char c = s.charAt(end);
            
            
            if (charMap.containsKey(c) && charMap.get(c) >= start) {
                start = charMap.get(c) + 1;
            }
            
            charMap.put(c, end);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
