class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Hashtable<String, List<String>> list = new Hashtable<>();
        for (String str: strs){
            char[] newChars = str.toCharArray();
            Arrays.sort(newChars);
            String sortedStr = new String(newChars); 
            list.putIfAbsent(sortedStr,new ArrayList<>());
            list.get(sortedStr).add(str);
        }
        return new ArrayList<>(list.values());
    }
}
