class Solution {
    boolean isPalindrome(String s) {
        // code here
        StringBuilder sb=new StringBuilder(s);
              sb.reverse();
              String s2=sb.toString();
              if (s.equals(s2)) {
                  return true;
              }

                      else{

                          return false;}
    }
}