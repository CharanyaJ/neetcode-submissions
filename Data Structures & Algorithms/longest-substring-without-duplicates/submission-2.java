class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxCount = 0;
        char[] chars = s.toCharArray();
        for (int right = 0; right < chars.length; right++){
            
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            
            maxCount = Math.max(right-left+1,maxCount);

        }
        return maxCount;
    }
}