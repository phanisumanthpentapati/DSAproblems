class SpecialStack {
   Stack<Integer> st1;
    Stack<Integer> st2;
    public SpecialStack() {
        // Define Stack
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        // Add an element to the top of Stack
        if(st1.isEmpty() && st2.isEmpty()){
            st1.push(x);
            st2.push(x);
        } else{
            st1.push(x);
            st2.push(Math.min(x,st2.peek()));
        }
    }

    public void pop() {
        // Remove the top element from the Stack
        // if(st1.isEmpty()){

        // }
        st1.pop();
        st2.pop();
    }

    public int peek() {
        // Returns top element of the Stack
        if(!st1.isEmpty()){
            return st1.peek();
        }
        return -1;
    }

    boolean isEmpty() {
        // Check if the stack is empty
        if(st1.size()==0){
            return true;
        } else{
            return false;
        }
    }

    public int getMin() {
        // Finds minimum element of Stack
        if(!st2.isEmpty()){
            return st2.peek();
        }
        return -1;
    }
}