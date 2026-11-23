# smallest-window-containing-0-1-and-2--170637

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T09:36:54.893Z  

```java
class Solution {
    public int smallestSubstring(String s) {
        // code here
        int idx0 = -1, idx1 = -1, idx2 = -1;
                int ans = Integer.MAX_VALUE;
                int n = s.length();

                for (int i = 0; i < n; i++) {
                    char ch = s.charAt(i);

                    if (ch == '0') idx0 = i;
                    else if (ch == '1') idx1 = i;
                    else if (ch == '2') idx2 = i;

                    if (idx0 != -1 && idx1 != -1 && idx2 != -1) {
                        int minIdx = Math.min(idx0, Math.min(idx1, idx2));
                        int maxIdx = Math.max(idx0, Math.max(idx1, idx2));

                        ans = Math.min(ans, maxIdx - minIdx + 1);
                    }
                }

                return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
};

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-window-containing-0-1-and-2--170637/1)