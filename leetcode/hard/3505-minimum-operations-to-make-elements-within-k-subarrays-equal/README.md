# Minimum Operations to Make Elements Within K Subarrays Equal

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an integer array `nums` and two integers, `x` and `k`. You can perform the following operation any number of times (**including zero**):

- Increase or decrease any element of nums by 1.

Return the  **minimum**  number of operations needed to have  **at least**  `k`  *non-overlapping subarrays*  of size  **exactly**  `x` in `nums`, where all elements within each subarray are equal.

 

 **Example 1:** 

 **Input:**  nums = [5,-2,1,3,7,3,6,4,-1], x = 3, k = 2

 **Output:**  8

 **Explanation:** 

- Use 3 operations to add 3 to nums[1] and use 2 operations to subtract 2 from nums[3]. The resulting array is [5, 1, 1, 1, 7, 3, 6, 4, -1].
- Use 1 operation to add 1 to nums[5] and use 2 operations to subtract 2 from nums[6]. The resulting array is [5, 1, 1, 1, 7, 4, 4, 4, -1].
- Now, all elements within each subarray [1, 1, 1] (from indices 1 to 3) and [4, 4, 4] (from indices 5 to 7) are equal. Since 8 total operations were used, 8 is the output.

 **Example 2:** 

 **Input:**  nums = [9,-2,-2,-2,1,5], x = 2, k = 2

 **Output:**  3

 **Explanation:** 

- Use 3 operations to subtract 3 from nums[4]. The resulting array is [9, -2, -2, -2, -2, 5].
- Now, all elements within each subarray [-2, -2] (from indices 1 to 2) and [-2, -2] (from indices 3 to 4) are equal. Since 3 operations were used, 3 is the output.

 

 **Constraints:** 

- 2 <= nums.length <= 105
- -106 <= nums[i] <= 106
- 2 <= x <= nums.length
- 1 <= k <= 15
- 2 <= k * x <= nums.length

## Solution

**Language:** Java  
**Runtime:** 975 ms (beats 18.42%)  
**Memory:** 130.8 MB (beats 89.47%)  
**Submitted:** 2026-11-04T05:57:29.678Z  

```java

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

```

---

[View on LeetCode](https://leetcode.com/problems/minimum-operations-to-make-elements-within-k-subarrays-equal/)