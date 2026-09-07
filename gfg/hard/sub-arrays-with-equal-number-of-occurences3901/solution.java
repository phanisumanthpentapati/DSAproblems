import java.util.*;

class Solution {

    public int sameOccurrence(int[] arr, int x, int y) {

        int n = arr.length;

        // If x and y are the same,
        // every subarray is valid
        if (x == y) {
            return n * (n + 1) / 2;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int ans = 0;

        map.put(0, 1);

        for (int num : arr) {

            if (num == x) {
                sum++;
            }
            else if (num == y) {
                sum--;
            }

            if (map.containsKey(sum)) {
                ans += map.get(sum);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return ans;
    }
}