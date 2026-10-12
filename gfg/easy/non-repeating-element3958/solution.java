import java.util.*;

class Solution {
    public int firstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Step 1: Count the frequency of each element
        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the first element that appears once
        for (int num : arr) {
            if (hm.get(num) == 1) {
                return num;
            }
        }

        return 0;
    }
}