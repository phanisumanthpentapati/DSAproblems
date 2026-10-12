import java.util.*;

class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        // Store all elements of b
        for (int num : b) {
            set.add(num);
        }

        // Check elements of a in their original order
        for (int num : a) {
            if (!set.contains(num)) {
                result.add(num);
            }
        }

        return result;
    }
}