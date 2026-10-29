class Solution {
    public int removeConsecutiveSame(String[] arr) {
        // code here
        Stack<String> s = new Stack<>();
               for(int i = 0; i < arr.length; i++){
                   if(s.isEmpty()){
                       s.push(arr[i]);
                   }
                   else if(s.peek().equals(arr[i])){
                       s.pop();
                   }
                   else{
                       s.push(arr[i]);
                   }
               }
               return s.size();
    }
};