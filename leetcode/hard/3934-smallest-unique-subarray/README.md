# Smallest Unique Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an integer array `nums`.

Find the  **minimum** length of a subarray that is  **not**   **identical**  to any other  **subarray**  in `nums`.

Return an integer denoting the  **minimum possible length**  of such a  **subarray**.

Two  **subarrays**  are considered identical if they have the same length and the same elements in corresponding positions.

 

Original
Java
 **Example 1:** 

 **Input:**  nums = [3,3,3]

 **Output:**  3

 **Explanation:** 

- Subarrays of length 1: [3] → appears 3 times
- Subarrays of length 2: [3, 3] → appears 2 times
- Subarrays of length 3: [3, 3, 3] → appears once

The subarray `[3, 3, 3]` is unique, so the smallest unique subarray length is 3.

 **Example 2:** 

 **Input:**  nums = [2,1,2,3,3]

 **Output:**  1

 **Explanation:** 

Subarrays of length 1:

- [2] → appears 2 times
- [1] → appears once
- [3] → appears 2 times
The subarray `[1]` is unique, so the smallest unique subarray length is 1.

 **Example 3:** 

 **Input:**  nums = [1,1,2,2,1]

 **Output:**  2

 **Explanation:** 

Subarrays of length 1:

- [1] → appears 3 times
- [2] → appears 2 times

Subarrays of length 2:

- [1, 1] → appears once
- [1, 2] → appears once
- [2, 2] → appears once
- [2, 1] → appears once
There is at least one subarray of length 2 that is unique, so the smallest unique subarray length is 2.

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 1 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 422 ms (beats 57.14%)  
**Memory:** 201 MB (beats 67.86%)  
**Submitted:** 2026-11-25T10:40:15.638Z  

```java
class Solution {
    boolean isValid(int[] nums, int k) {
        int n = nums.length;
        int l = 0, r = 0;

        HashMap<Long, Integer> mp = new HashMap<>();

        long mod = 1000000007;
        long base = 100001;
        long p = 1;
        long hash = 0;

        // Calculate base^(k-1)
        for (int i = 0; i < k - 1; i++) {
            p = (p * base) % mod;
        }

        // Sliding Window + Rolling Hash
        while (r < n) {

            // Add incoming element
            hash = (hash * base + nums[r]) % mod;

            if (r - l + 1 == k) {

                // Store frequency of current hash
                mp.put(hash, mp.getOrDefault(hash, 0) + 1);

                // Remove outgoing element
                hash = (hash - nums[l] * p % mod + mod) % mod;

                l++;
            }
            r++;
        }

        // Check whether a unique subarray exists
        for (int e : mp.values()) {
            if (e == 1) return true;
        }

        return false;
    }

    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;
        int l = 1;
        int h = n;
        int ans = n;

        // Binary Search on Answer
        while (l <= h) {
            int m = l + (h - l) / 2;

            if (isValid(nums, m)) {
                h = m - 1;
                ans = m;
            } else {
                l = m + 1;
            }
        }

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-unique-subarray/)