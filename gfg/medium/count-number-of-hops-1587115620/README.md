# count-number-of-hops-1587115620

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-28T12:18:12.001Z  

```java
class Solution {

    static int countWays(int n) {
        // add your code here
        int[] dp = new int[n+1];
                dp[n] = 1;
                int[] jumps = {1,2,3};
                for(int i=n-1; i>=0; i--) {
                    for(int j=0; j<3; j++) {
                        int jump = jumps[j];

                        if(jump + i < dp.length) {
                            dp[i] += dp[i + jump];
                        }
                    }
                }
                return dp[0];
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-number-of-hops-1587115620/1)