class Solution {
    public void deleteMid(Stack<Integer> s) {
        int mid = s.size() / 2;

        delete(s, mid);
    }

    private void delete(Stack<Integer> s, int mid) {

        if (mid == 0) {
            s.pop();
            return;
        }

        int top = s.pop();

        delete(s, mid - 1);

        s.push(top);
    }
}