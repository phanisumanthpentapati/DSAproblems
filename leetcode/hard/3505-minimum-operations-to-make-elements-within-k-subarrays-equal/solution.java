
import java.util.*;

class Solution {

    class MedianWindow {
        TreeMap<Integer, Integer> low = new TreeMap<>();
        TreeMap<Integer, Integer> high = new TreeMap<>();

        int lowSize = 0;
        int highSize = 0;

        long lowSum = 0;
        long highSum = 0;

        void add(int num) {

            if (low.isEmpty() || num <= low.lastKey()) {
                low.put(num, low.getOrDefault(num, 0) + 1);
                lowSize++;
                lowSum += num;
            } else {
                high.put(num, high.getOrDefault(num, 0) + 1);
                highSize++;
                highSum += num;
            }

            balance();
        }

        void remove(int num) {

            if (low.containsKey(num)) {
                removeFrom(low, num);
                lowSize--;
                lowSum -= num;
            } else {
                removeFrom(high, num);
                highSize--;
                highSum -= num;
            }

            balance();
        }

        void removeFrom(TreeMap<Integer, Integer> map, int num) {
            int count = map.get(num);

            if (count == 1) {
                map.remove(num);
            } else {
                map.put(num, count - 1);
            }
        }

        void balance() {

            while (lowSize > highSize + 1) {
                int val = low.lastKey();

                removeFrom(low, val);
                lowSize--;
                lowSum -= val;

                high.put(val, high.getOrDefault(val, 0) + 1);
                highSize++;
                highSum += val;
            }

            while (lowSize < highSize) {
                int val = high.firstKey();

                removeFrom(high, val);
                highSize--;
                highSum -= val;

                low.put(val, low.getOrDefault(val, 0) + 1);
                lowSize++;
                lowSum += val;
            }
        }

        long getCost() {

            long median = low.lastKey();

            long leftCost = median * lowSize - lowSum;
            long rightCost = highSum - median * highSize;

            return leftCost + rightCost;
        }
    }

    public long minOperations(int[] nums, int x, int k) {

        int n = nums.length;

        long[] costs = new long[n - x + 1];

        MedianWindow window = new MedianWindow();

        // Step 1: Calculate cost of every window

        for (int i = 0; i < n; i++) {

            window.add(nums[i]);

            if (i >= x) {
                window.remove(nums[i - x]);
            }

            if (i >= x - 1) {
                costs[i - x + 1] = window.getCost();
            }
        }

        // Step 2: Dynamic Programming

        long INF = Long.MAX_VALUE / 4;

        long[] prev = new long[n + 1];
        long[] curr = new long[n + 1];

        for (int j = 1; j <= k; j++) {

            Arrays.fill(curr, INF);

            for (int i = 1; i <= n; i++) {

                // Option 1: Skip current element
                curr[i] = curr[i - 1];

                // Option 2: Select a window of size x
                if (i >= x && prev[i - x] != INF) {

                    long cost = prev[i - x] + costs[i - x];

                    curr[i] = Math.min(curr[i], cost);
                }
            }

            long[] temp = prev;
            prev = curr;
            curr = temp;
        }

        return prev[n];
    }
}
