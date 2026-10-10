class Solution {
    boolean isGoodOrBad(String s) {
        // code here
    int vowels = 0, consonants = 0;

           for (int i = 0; i < s.length(); i++) {
               char ch = s.charAt(i);

               if (ch == '?') {
                   vowels++;
                   consonants++;
               }
               else if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {
                   vowels++;
                   consonants = 0;
               }
               else {
                   consonants++;
                   vowels = 0;
               }

               if (vowels > 5 || consonants > 3) {
                   return false;
               }
           }

           return true;
    }
}