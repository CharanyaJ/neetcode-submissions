class Solution {
  public List<String> letterCombinations(String digits) {
     
    Map<Character, char[]> phone = new HashMap<>();
    List<String> finalResult = new ArrayList<>();
    phone.put('0', new char [] {'0'});
    phone.put('1', new char [] {'1'});
    phone.put('2', new char [] {'a', 'b', 'c'});
    phone.put('3', new char [] {'d', 'e', 'f'});
    phone.put('4', new char [] {'g', 'h', 'i'});
    phone.put('5', new char [] {'j', 'k', 'l'});
    phone.put('6', new char [] {'m', 'n', 'o'});
    phone.put('7', new char [] {'p', 'q', 'r', 's'});
    phone.put('8', new char [] {'t', 'u', 'v'});
    phone.put('9', new char [] {'w', 'x', 'y', 'z'});

    backtrack(0, "", digits, phone, finalResult);

    return finalResult;
  }

    public String backtrack(int index, String currentString, String digits, Map<Character, 
    char[]> phone, List<String> finalResult){
        if (!digits.isEmpty()){
        if (currentString.length() == digits.length()){
            finalResult.add(currentString);
            return currentString;
        }
        
            for (char c : phone.get(digits.charAt(index)))
                backtrack(index+1, currentString + c, digits, phone, finalResult);
        }
        return currentString;
    }
}
  
