class Solution {
    Boolean allCharactersSame(String s) {
        // code here
        for (int i = 0; i < s.length(); i++) {
                   if (s.charAt(i) != s.charAt(0)) {
                       return false;   // found a character different from the first
                   }
               }
               return true;            // all ch
    }
}