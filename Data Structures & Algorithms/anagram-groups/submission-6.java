class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> list = new HashMap<>();
        for (String str : strs) {
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i : count) {
                sb.append('#'); // Delimiter
                sb.append(i);
            }
            String key = sb.toString();
            list.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(list.values());
    }
}
