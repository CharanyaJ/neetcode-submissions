class Solution {
private static final String[] MAP = {
        "",     "",     "abc",  "def",
        "ghi",  "jkl",  "mno",  "pqrs",
        "tuv",  "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.isEmpty()) return res;

        backtrack(0, digits, new StringBuilder(), res);
        return res;
    }

    private void backtrack(int index, String digits, StringBuilder path, List<String> res) {
        if (index == digits.length()) {
            res.add(path.toString());
            return;
        }

        String letters = MAP[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            path.append(c);                          // choose
            backtrack(index + 1, digits, path, res); // explore
            path.deleteCharAt(path.length() - 1);    // undo
        }
    }
}
  
