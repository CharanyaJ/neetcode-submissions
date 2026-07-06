class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Hashtable<String, List<String>> list = new Hashtable<>();
        for (String str: strs){
            char[] newChars = str.toCharArray();
            Arrays.sort(newChars);
            String sortedStr = new String(newChars); 
            //System.out.println("sortedString: " + sortedStr);
            if (list.containsKey(sortedStr)){
                //System.out.println(list.get(sortedStr).contains(str));
                //if(!list.get(sortedStr).contains(str))
                    list.get(sortedStr).add(str);
            }
            else {
                List<String> newListStr = new ArrayList<String>();
                newListStr.add(str);
                list.put(sortedStr, newListStr);
            }
        }
        list.forEach((key, value) -> {
            result.add(value);
        });
        return result;
    }
}
