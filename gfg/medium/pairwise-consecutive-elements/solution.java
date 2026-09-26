class Solution {
    public boolean pairWiseConsecutive(Stack<Integer> st) {

        if (st.size() % 2 != 0) {
            st.pop();
        }

        while (!st.empty()) {

            int first = st.peek();
            st.pop();

            int second = st.peek();
            st.pop();

            if (first == second + 1 || first == second - 1) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
}