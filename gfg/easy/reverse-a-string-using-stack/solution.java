import java.util.*;

class Solution {
    public String reverse(String S) {
        Stack<Character> st = new Stack<>();

        for (char c : S.toCharArray()) {
            st.push(c);
        }

        StringBuilder result = new StringBuilder();

        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        return result.toString();
    }
}