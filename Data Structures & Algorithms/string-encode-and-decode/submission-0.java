class Solution {

    public String encode(List<String> strs) {
        StringBuilder mainStr = new StringBuilder();
        for (String str : strs){
                mainStr.append(str.length()).append("#").append(str);
        }
        return mainStr.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0;
        while (i<str.length()){
            int delimiter = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, delimiter));
            i = delimiter + 1;
            result.add(str.substring(i, i+length));
            i +=length;
        }
        return result;
    }
}
