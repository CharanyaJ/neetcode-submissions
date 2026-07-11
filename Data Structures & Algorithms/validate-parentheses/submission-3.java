class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty() || stack.pop() != map.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
