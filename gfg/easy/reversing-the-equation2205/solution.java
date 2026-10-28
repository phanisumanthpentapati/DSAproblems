import java.util.Stack;

class Solution {
    String reverseEqn(String S) {
        Stack<String> stack = new Stack<>();
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (Character.isDigit(ch)) {
                num.append(ch);
            } else {
                stack.push(num.toString());
                stack.push(String.valueOf(ch));
                num.setLength(0);
            }
        }

        stack.push(num.toString());

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}