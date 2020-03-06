package Stack;

import java.util.Stack;

public class ValidParentheses {
    public static boolean validParentheses(String s) {
        // Time complexity = O(N)
        // Space complexity = O(N)
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' && stack.size() > 0 && stack.peek() == '(' ||
                    ch == ']' && stack.size() > 0 && stack.peek() == '[' ||
                    ch == '}' && stack.size() > 0 && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.size() == 0;
    }
}
