
class Solution {
    public void reverseArray(int[] arr) {
        // codehere
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        int ind = 0;
        while(!st.isEmpty()){
            int top = st.peek();
            st.pop();
            arr[ind]=top;
            ind++;
        }
    }
}