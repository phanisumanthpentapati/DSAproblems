class Solution {
    public static String reverseString(String s) {
        // code here
        
       StringBuilder rev = new StringBuilder(s);
                     rev.reverse();
                     return rev.toString();
    }
}