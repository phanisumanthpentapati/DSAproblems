class Solution {
    ArrayList<Integer> bracketNumbers(String s) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        int num = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                num++;
                st.push(num);
                ans.add(num);
            } else if (ch == ')') {
                ans.add(st.peek());
                st.pop();
            }
        }

        return ans;
    }
}