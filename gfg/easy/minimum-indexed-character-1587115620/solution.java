import java.util.*;

class Solution {
    public int minIndexChar(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();

        // Store all characters of s2
        for (int j = 0; j < s2.length(); j++) {
            set.add(s2.charAt(j));
        }

        // Search s1 from left to right
        for (int i = 0; i < s1.length(); i++) {
            if (set.contains(s1.charAt(i))) {
                return i;
            }
        }

        return -1;
    }
}