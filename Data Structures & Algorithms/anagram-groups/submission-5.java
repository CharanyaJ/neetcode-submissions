class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> list = new HashMap<>();
        for (String str : strs) {
            char[] newChars = str.toCharArray();
            int[] count = new int[26];
            for (char c : newChars) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i : count) {
                sb.append('#'); // Delimiter
                sb.append(i);
            }
            String sortedStr = sb.toString();
            System.out.println("sorted:" + sortedStr);
            list.putIfAbsent(sortedStr, new ArrayList<>());
            list.get(sortedStr).add(str);
        }
        return new ArrayList<>(list.values());
    }
}
