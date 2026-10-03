import java.util.*;

class Solution {
    public static char getMaxOccuringChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        char maxChar = s.charAt(0);
        int maxCount = hm.get(maxChar);

        // Find maximum frequency
        for (char ch : s.toCharArray()) {
            if (hm.get(ch) > maxCount ||
                (hm.get(ch) == maxCount && ch < maxChar)) {

                maxCount = hm.get(ch);
                maxChar = ch;
            }
        }

        return maxChar;
    }
}