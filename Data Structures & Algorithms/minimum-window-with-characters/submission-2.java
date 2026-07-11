class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        int[] freq_t = new int[128];
        for (int i=0; i< t.length(); i++){
            freq_t[t.charAt(i)]++;
        }

        int minLen = Integer.MAX_VALUE;
        int required = t.length();
        int left=0;
        int minStart=0;
        
        for (int right=0; right<s.length(); right++){
            if(freq_t[s.charAt(right)]>0){
                required--;
            }
            freq_t[s.charAt(right)]--;
            
            while (required==0){
                int windowLen = right-left+1;
                if(windowLen < minLen){
                    minLen = windowLen;
                    minStart=left;
                }
                
                char leftChar = s.charAt(left);
                freq_t[leftChar]++;
                if (freq_t[leftChar] > 0){
                    required++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart+minLen);
    }
}
