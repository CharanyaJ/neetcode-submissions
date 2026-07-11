class Solution {
    public boolean isValid(String s) {

        HashMap <Character, Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');

        Stack<Character> stack = new Stack();


        for (char c : s.toCharArray()){
            if (c=='{' || c=='[' || c=='('){
                stack.push(c);
            }
            
            else if (c=='}' || c==']' || c==')'){
                if(stack.isEmpty()) return false;
                else {
                    char d = stack.pop();
                    if (!map.get(c).equals(d)){
                        return false;
                    }
                }
            }
        
        }
        if (!stack.isEmpty())
            return false;
        else
            return true;
        
    }
}
