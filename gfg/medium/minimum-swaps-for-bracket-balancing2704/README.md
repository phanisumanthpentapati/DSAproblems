# minimum-swaps-for-bracket-balancing2704

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-02T05:17:54.575Z  

```java
class Solution {
    static int minimumNumberOfSwaps(String s) {
        int ans = 0;
        int i = 0;
        int curr = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '[') {
                ans += Math.max(curr, 0);
                curr--;
            } else {
                curr++;
            }
            i++;
        }

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimum-swaps-for-bracket-balancing2704/1)