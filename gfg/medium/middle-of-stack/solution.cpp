class Solution {
  public:
    int stackMiddle(stack<int>& st) {
        // code here
        int n=st.size(); //actual size of stack
           stack<int>st1;
           int m=n/2; 

           while(m!=0)//push the element in second stack
           {
               st1.push(st.top());
               st.pop();
               m--;
           }
           int ans=st.top(); //store middle of element 
           while(!st1.empty())
           {
               st.push(st1.top());
               st1.pop();

           }
           return ans; //return middle of element
    }
};