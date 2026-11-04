
class Solution {

    public void sortStack(java.util.Stack<Integer> st) {

        // Base condition
        if (st.isEmpty()) {
            return;
        }

        // Remove the top element
        int top = st.pop();

        // Sort the remaining stack
        sortStack(st);

        // Insert the removed element
        insertSorted(st, top);
    }

    private void insertSorted(java.util.Stack<Integer> st, int value) {

        // If stack is empty or top is smaller,
        // insert the element
        if (st.isEmpty() || st.peek() <= value) {
            st.push(value);
            return;
        }

        // Remove the larger element
        int top = st.pop();

        // Insert value in the correct position
        insertSorted(st, value);

        // Restore the removed element
        st.push(top);
    }
}
