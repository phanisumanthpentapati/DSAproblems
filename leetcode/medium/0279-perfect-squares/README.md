# Perfect Squares

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer `n`, return  *the least number of perfect square numbers that sum to*  `n`.

A  **perfect square**  is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, `1`, `4`, `9`, and `16` are perfect squares while `3` and `11` are not.

 

 **Example 1:** 

```
Input: n = 12
Output: 3
Explanation: 12 = 4 + 4 + 4.

```

 **Example 2:** 

```
Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.

```

 

 **Constraints:** 

- 1 <= n <= 104

## Solution

**Language:** Java  
**Runtime:** 37 ms (beats 45.55%)  
**Memory:** 44.5 MB (beats 66.44%)  
**Submitted:** 2026-09-08T15:45:43.029Z  

```java
class Solution {
    public int numSquares(int n) {

        int[] dp = new int[n + 1];

        // Maximum possible answer is n
        // because 1 + 1 + ... + 1 = n
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j * j <= i; j++) {

                int square = j * j;

                dp[i] = Math.min(dp[i], dp[i - square] + 1);
            }
        }

        return dp[n];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/perfect-squares/)