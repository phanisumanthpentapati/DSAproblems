class Solution {
    public String longest(String[] arr) {
        // code here
         String ans = "";

         for (int i = 0; i < arr.length; i++) {

             if (arr[i].length() > ans.length()) {
                 ans = arr[i];
             }
         }

         return ans;
    }
}